package com.lulu.expense.controller;

import com.lulu.expense.model.response.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Milo Ting
 * @Description:
 * @Date: 2017/10/29 16:34
 * @ModifiedBy:
 */
@Controller
@RequestMapping(value = "/expense",method = RequestMethod.GET)
public class LiveController {
    @RequestMapping("/isLive")
    public ApiResponse isLive(){
        return ApiResponse.success("项目正在运行中...");
    }
}
