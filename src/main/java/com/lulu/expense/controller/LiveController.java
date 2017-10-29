package com.lulu.expense.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/10/29 16:34
 * @ModifiedBy:
 */
@Controller
@RequestMapping("/expense")
public class LiveController {
    @RequestMapping("/isLive")
    public String isLive(){
        return "index";
    }
}
