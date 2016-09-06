package com.seapeng.BookSystem.controller;

import com.seapeng.BookSystem.model.BookAndSum;
import com.seapeng.BookSystem.model.TBook;
import com.seapeng.BookSystem.model.TInRecord;
import com.seapeng.BookSystem.service.IBookService;
import com.seapeng.BookSystem.service.IInRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
@RequestMapping("/web/inreo")
public class InReoController {
    @Resource
    private IInRecordService inRecordService;
    @Resource
    private IBookService bookService;

    List<String[]> booklisttemp = new ArrayList<String[]>();
    String[] temp = null;
    int count = 0;

    @RequestMapping(method = RequestMethod.GET)
    public String inreo(Model model){
        booklisttemp.clear();
        count = 0;
        List<TInRecord> inRecordList = inRecordService.selectAll();
        List<BookAndSum> bookAndSumList = new ArrayList<BookAndSum>();

        for (TInRecord inRecord:inRecordList){
            for (int i=0;i<inRecord.getBookInRecordList().size();i++){
                BookAndSum bookAndSum = new BookAndSum(inRecord.getId(),inRecord.getRecordDate(),inRecord.getBookList().get(i).getBookName(),inRecord.getBookInRecordList().get(i).getInSum());
                bookAndSumList.add(bookAndSum);
            }
        }
        model.addAttribute("bookAndSumList",bookAndSumList);
        return "web/inreo";
    }

    @RequestMapping(value = "/inreoadd",method = RequestMethod.GET)
    public String add(@ModelAttribute TBook book,Model model){
        List<TBook> bookList = bookService.selectAll();
        model.addAttribute("booklisttemp",booklisttemp);
        model.addAttribute("bookList",bookList);
        return "web/inreoadd";
    }

    @RequestMapping(value = "/inreoadd",method = RequestMethod.POST)
    public String add(TBook book,int size,RedirectAttributes attributes){
        book = bookService.selectByPrimaryKey(book.getId());
        temp = new String[]{book.getBookName(), String.valueOf(book.getBookPrice()), String.valueOf(size), String.valueOf(book.getId()), String.valueOf(count)};

        boolean panduan = true;
        Iterator<String[]> iterator = booklisttemp.iterator();
        while (iterator.hasNext()){
            String[] strings = iterator.next();
            if (String.valueOf(book.getId()).equals(strings[3])){
                strings[2] = String.valueOf(Integer.valueOf(strings[2]) + Integer.valueOf(size));
                System.out.println("");
                panduan = false;
                break;
            }
        }

        if (panduan){
            booklisttemp.add(temp);
        }

        attributes.addFlashAttribute("booklisttemp",booklisttemp);
        count++;
        return "redirect:/web/inreo/inreoadd";
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public @ResponseBody TBook getSize(int id){
        TBook book = bookService.selectByPrimaryKey(id);
        return book;
    }
    @RequestMapping(value = "/in",method = RequestMethod.GET)
    public String in(){
        if (!booklisttemp.isEmpty()) {
            TInRecord inRecord = new TInRecord();
            inRecord.setRecordDate(new Date());
            inRecordService.insert(inRecord);
            for (String[] s : booklisttemp) {
                TBook inBook = bookService.selectByPrimaryKey(Integer.valueOf(s[3]));
                long beforSize = inBook.getRepertorySize();
                inBook.setRepertorySize(beforSize + Integer.valueOf(s[2]));
                bookService.updateByPrimaryKeySelective(inBook);
                inRecordService.insert(inRecord.getId(), inBook.getId(), Integer.valueOf(s[2]));
            }

        }
        booklisttemp.clear();
        return "redirect:/web/inreo";
    }

    @RequestMapping(value = "/clear",method = RequestMethod.GET)
    public String clear(){
        booklisttemp.clear();
        count = 0;
        return "redirect:/web/inreo/inreoadd";
    }

    @RequestMapping(value = "/remove",method = RequestMethod.GET)
    public String remove(@RequestParam("temp") String temp){
        Iterator<String[]> iterator = booklisttemp.iterator();
        while (iterator.hasNext()){
            String[] strings = iterator.next();
            if (temp.equals(strings[4])){
                iterator.remove();
            }
        }
        return "redirect:/web/inreo/inreoadd";
    }
}
