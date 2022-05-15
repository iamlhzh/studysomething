package com.lhzh.studyconfiguration.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 卢宏政
 * @date 2022/5/15 15:04
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
