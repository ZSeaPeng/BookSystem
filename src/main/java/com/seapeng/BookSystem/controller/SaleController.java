package com.seapeng.BookSystem.controller;

import com.seapeng.BookSystem.model.SaleBookInfo;
import com.seapeng.BookSystem.model.TBook;
import com.seapeng.BookSystem.model.TSaleRecord;
import com.seapeng.BookSystem.service.IBookService;
import com.seapeng.BookSystem.service.ISaleRecordService;
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
@RequestMapping("/web/sale")
public class SaleController {

    @Resource
    private ISaleRecordService saleRecordService;
    @Resource
    private IBookService bookService;

    List<String[]> booklisttemp = new ArrayList<String[]>();
    String[] temp = null;
    int count = 0;
    List<SaleBookInfo> saleBookInfoList = new ArrayList<SaleBookInfo>();
    @RequestMapping(method = RequestMethod.GET)
    public String sale(Model model){
        booklisttemp.clear();
        //搜索t_salerecord数据表的全部数据
        List<TSaleRecord> saleRecordList = saleRecordService.selectAll();
        saleBookInfoList.clear();
        for(TSaleRecord saleRecord:saleRecordList){
            for (int i=0;i<saleRecord.getBookSaleRecordList().size();i++){
                SaleBookInfo saleBookInfo = new SaleBookInfo(saleRecord.getId(),saleRecord.getBookList().get(i).getBookName(),
                        saleRecord.getBookSaleRecordList().get(i).getTradeSum()*saleRecord.getBookList().get(i).getBookPrice(),
                        saleRecord.getRecordDate(),
                        saleRecord.getBookSaleRecordList().get(i).getTradeSum());
                saleBookInfoList.add(saleBookInfo);
            }
        }
        model.addAttribute("saleBookInfoList",saleBookInfoList);
        return "web/sale";
    }

    @RequestMapping(value = "/saleadd",method = RequestMethod.GET)
    public String add(@ModelAttribute TBook book, Model model){
        List<TBook> bookList = bookService.selectAll();
        model.addAttribute("booklisttemp",booklisttemp);
        model.addAttribute("bookList",bookList);
        return "web/saleadd";
    }

    @RequestMapping(value = "/saleadd",method = RequestMethod.POST)
    public String add(TBook book,int size,RedirectAttributes attributes){
        book = bookService.selectByPrimaryKey(book.getId());
        temp = new String[]{book.getBookName(), String.valueOf(book.getBookPrice()), String.valueOf(size), String.valueOf(book.getId()), String.valueOf(count)};

        boolean panduan = true;
        Iterator<String[]> iterator = booklisttemp.iterator();
        while (iterator.hasNext()) {
            String[] strings = iterator.next();
            if (String.valueOf(book.getId()).equals(strings[3])) {
                strings[2] = String.valueOf(Integer.valueOf(strings[2]) + Integer.valueOf(size));
                panduan = false;
                break;
            }
        }
        if (panduan){
            booklisttemp.add(temp);
        }

        attributes.addFlashAttribute("booklisttemp",booklisttemp);
        count++;
        return "redirect:/web/sale/saleadd";
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public @ResponseBody
    TBook getSize(int id){
        TBook book = bookService.selectByPrimaryKey(id);
        System.out.println(book);
        return book;
    }

    @RequestMapping(value = "/out",method = RequestMethod.GET)
    public String in(){
        if (!booklisttemp.isEmpty()) {
            TSaleRecord saleRecord = new TSaleRecord();
            saleRecord.setRecordDate(new Date());
            saleRecordService.insert(saleRecord);
            for (String[] s : booklisttemp) {
                TBook inBook = bookService.selectByPrimaryKey(Integer.valueOf(s[3]));
                long beforSize = inBook.getRepertorySize();
                inBook.setRepertorySize(beforSize - Integer.valueOf(s[2]));
                bookService.updateByPrimaryKeySelective(inBook);
                System.out.println("saleRecord.getId(), inBook.getId(), Integer.valueOf(s[2])"+saleRecord.getId()+"-----"+inBook.getId()+"-----"+Integer.valueOf(s[2]));
                saleRecordService.insert(saleRecord.getId(), inBook.getId(), Integer.valueOf(s[2]));
            }
        }
        booklisttemp.clear();
        return "redirect:/web/sale";
    }

    @RequestMapping(value = "/clear",method = RequestMethod.GET)
    public String clear(){
        booklisttemp.clear();
        count = 0;
        return "redirect:/web/sale/saleadd";
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
        System.out.println("afterlistSize--->"+booklisttemp.size());
        return "redirect:/web/sale/saleadd";
    }

}
