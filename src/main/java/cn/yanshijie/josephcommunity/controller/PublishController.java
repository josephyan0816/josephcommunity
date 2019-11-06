package cn.yanshijie.josephcommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * PublishController
 *
 * @author Joseph
 * @version 1.0
 * 2019/11/6 8:42
 **/
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publish()
    {
        return "publish";
    }
}
