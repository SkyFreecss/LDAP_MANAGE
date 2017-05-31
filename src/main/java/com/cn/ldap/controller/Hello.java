package com.cn.ldap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wejeh on 2017/5/15.
 */

@Controller
public class Hello {

        @RequestMapping("/hello")
        public @ResponseBody String test()
        {
            return "hello world!";
        }
}
