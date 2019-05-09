package club.sorua.springboot_demo.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    String goMain(HttpServletRequest request) {
        System.out.println("hello world");
        return "index";
    }

}
