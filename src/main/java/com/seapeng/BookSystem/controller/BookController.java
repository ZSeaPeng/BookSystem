package com.seapeng.BookSystem.controller;

import com.seapeng.BookSystem.model.TBook;
import com.seapeng.BookSystem.model.TBookType;
import com.seapeng.BookSystem.model.TPublisher;
import com.seapeng.BookSystem.service.IBookService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
@RequestMapping("/web/book")
public class BookController {

    @Resource
    private IBookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String book(Model model){
        List<TBook> bookList = bookService.selectAll();
        model.addAttribute("bookList",bookList);
        return "web/book";
    }

    @RequestMapping(value = "{id}/information",method = RequestMethod.GET)
    public String information(@PathVariable int id,Model model){
        TBook book = bookService.selectByPrimaryKey(id);
        model.addAttribute("book",book);
        return "web/bookInformation";
    }

    @RequestMapping(value = "{id}/update",method = RequestMethod.GET)
    public String update(@PathVariable int id,@ModelAttribute TBook book,
                           Model model){
        book = bookService.selectByPrimaryKey(id);
        List<TBookType> bookTypeList = bookService.getTypeList();
        List<TPublisher> publisherList = bookService.getPubList();
        model.addAttribute("book",book);
        model.addAttribute("bookTypeList",bookTypeList);
        model.addAttribute("publisherList",publisherList);
        return "web/bookupdate";
    }

    @RequestMapping(value = "{id}/update",method = RequestMethod.POST)
    public String update(@PathVariable int id, TBook book, MultipartFile multipartFile, HttpServletRequest request){

        String realPath =  request.getSession().getServletContext().getRealPath("/static/upload");
        String imgUrl = "\\static\\upload\\book_"+id+".jpg";

        if (!multipartFile.isEmpty()){
        File img = new File(realPath+"/book_"+id+".jpg");
        try {
            FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),img);
        } catch (IOException e) {
            e.printStackTrace();
        }
        book.setImageUrl(imgUrl);}
        bookService.updateByPrimaryKeySelective(book);
        return "redirect:/web/book/{id}/information";
    }

    @RequestMapping(value = "/bookadd",method = RequestMethod.GET)
    public String add(@ModelAttribute("book") TBook book,Model model){
        List<TBookType> bookTypeList = bookService.getTypeList();
        List<TPublisher> publisherList = bookService.getPubList();
        model.addAttribute("bookTypeList",bookTypeList);
        model.addAttribute("publisherList",publisherList);
        return "web/bookadd";
    }

    @RequestMapping(value = "/bookadd",method = RequestMethod.POST)
    public String add(TBook book,MultipartFile multipartFile,HttpServletRequest request){
        bookService.insertSelective(book);
        String realPath =  request.getSession().getServletContext().getRealPath("/static/upload");
        String imgUrl = "\\static\\upload\\book_"+book.getId()+".jpg";
        if (!multipartFile.isEmpty()){
            File img = new File(realPath+"/book_"+book.getId()+".jpg");
            try {
                FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),img);
            } catch (IOException e) {
                e.printStackTrace();
            }
            book.setImageUrl(imgUrl);
            bookService.updateByPrimaryKeySelective(book);
        }
        int bookId = book.getId();
        return "redirect:/web/book/"+bookId+"/information";
    }

    @RequestMapping(value = "{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        bookService.deleteByPrimaryKey(id);
        return "redirect:/web/book";
    }
}
