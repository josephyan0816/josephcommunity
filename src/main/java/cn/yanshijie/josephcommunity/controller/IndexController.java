package cn.yanshijie.josephcommunity.controller;

import cn.yanshijie.josephcommunity.mapper.UserMapper;
import cn.yanshijie.josephcommunity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * HelloController
 *
 * @author Joseph
 * @version 1.0
 * 2019/11/3 22:40
 **/
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("token")) {
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if (user!=null)
                {
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        return "index";
    }
}
