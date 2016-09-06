package com.seapeng.BookSystem.controller;

import com.seapeng.BookSystem.model.TPublisher;
import com.seapeng.BookSystem.service.ITPublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
@RequestMapping("/web/publisher")
public class PublisherController {

    @Resource
    private ITPublisherService publisherService;
    @RequestMapping(method = RequestMethod.GET)
    public String publishier(Model model){


        List<TPublisher> publishers = publisherService.selectAll();
        model.addAttribute("publishers",publishers);
        return "web/publisher";
    }

    @RequestMapping(value = "{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        publisherService.deleteByPrimaryKey(id);
        return "redirect:/web/publisher";
    }
    @RequestMapping(value = "/pubadd",method = RequestMethod.GET)
    public String pubadd(@ModelAttribute TPublisher publisher){
        return "web/pubadd";
    }

    @RequestMapping(value = "/pubadd",method = RequestMethod.POST)
    public String pubadd(TPublisher publisher,Model model){
        publisherService.insert(publisher);
        return "redirect:/web/publisher";
    }

    @RequestMapping(value = "{id}/update",method = RequestMethod.GET)
    public String pubUpdate(@PathVariable int id,Model model){
        TPublisher publisher = publisherService.selectByPrimaryKey(id);
        model.addAttribute(publisher);
        return "web/pubadd";
    }

    @RequestMapping(value = "{id}/update",method = RequestMethod.POST)
    public String pubUpdate(@PathVariable int id,TPublisher publisher){
        publisherService.updateByPrimaryKey(publisher);
        return "redirect:/web/publisher";
    }
}
