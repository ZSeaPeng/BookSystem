package com.seapeng.BookSystem.controller;

import com.seapeng.BookSystem.model.TBookType;
import com.seapeng.BookSystem.service.IBookService;
import com.seapeng.BookSystem.service.ITypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
@RequestMapping("/web/type")
public class TypeController {

    @Resource
    private ITypeService typeService;

    @Resource
    private IBookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String type(Model model){
        List<TBookType> typeList = typeService.selectAll();
        model.addAttribute("typeList",typeList);
        return "web/type";
    }

    @RequestMapping(value = "/typeadd",method = RequestMethod.GET)
    public String typeadd(@ModelAttribute TBookType type){
        return "web/typeadd";
    }

    @RequestMapping(value = "/typeadd",method = RequestMethod.POST)
    public String typeadd(TBookType type, Model model){
        System.out.println(type.toString());
        typeService.insert(type);
        return "redirect:/web/type";
    }

    @RequestMapping(value = "{id}/update",method = RequestMethod.GET)
    public String typeUpdate(@PathVariable int id, Model model){
        TBookType bookType = typeService.selectByPrimaryKey(id);
        model.addAttribute("TBookType",bookType);
        return "web/typeadd";
    }

    @RequestMapping(value = "{id}/update",method = RequestMethod.POST)
    public String typeUpdate(@PathVariable int id, TBookType type){
        System.out.println("修改后=  "+type.getTypeIntro());
        System.out.println("值 = "+typeService.updateByPrimaryKey(type));
        return "redirect:/web/type";
    }

    @RequestMapping(value = "{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable int id, RedirectAttributes attributes){
        System.out.println(id);
        try {
            typeService.deleteByPrimaryKey(id);
        }catch (Exception e){
            System.out.println("无法删除");
            String texterr = "该种类下存在书籍，暂时无法删除";
            attributes.addFlashAttribute("texterr",texterr);
        }
        return "redirect:/web/type";
    }
}
