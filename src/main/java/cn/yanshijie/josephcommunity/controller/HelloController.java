package cn.yanshijie.josephcommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloController
 *
 * @author Joseph
 * @version 1.0
 * 2019/11/3 22:40
 **/
@Controller
public class HelloController {

    @GetMapping("/")
    public String hello()
    {
        return "index";
    }
}
