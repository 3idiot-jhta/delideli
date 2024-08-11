package kr.co.jhta.app.delideli.common.control;

import kr.co.jhta.app.delideli.user.account.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
}