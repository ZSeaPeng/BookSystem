package com.seapeng.BookSystem.controller;


import com.seapeng.BookSystem.model.TBook;
import com.seapeng.BookSystem.model.TPublisher;
import com.seapeng.BookSystem.service.IBookService;
import com.seapeng.BookSystem.service.ITPublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
@RequestMapping("/web")
public class SearchController {
    @Resource
    private ITPublisherService publisherService;

    @Resource
    private IBookService bookService;
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String search(String some, Model model){
        System.out.println(some);
        List<TPublisher> publishers = publisherService.selectByName(some);
        if (publishers.size()!=0) {
            model.addAttribute("publishers",publishers);
            return "web/publisher";
        }else {
            List<TBook> bookList = bookService.selectByName(some);
            model.addAttribute("bookList",bookList);
            return "web/book";
        }
    }
}
