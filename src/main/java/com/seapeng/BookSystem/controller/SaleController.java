package com.seapeng.BookSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
@RequestMapping("/web/sale")
public class SaleController {

    @RequestMapping(method = RequestMethod.GET)
    public String sale(){
        return "web/sale";
    }

}
