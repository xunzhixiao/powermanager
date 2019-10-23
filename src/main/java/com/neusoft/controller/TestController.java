package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("index")
public class TestController {

    @ResponseBody
    @RequestMapping("test")
    public Object test()
    {

        return "hello boot";
    }

}
