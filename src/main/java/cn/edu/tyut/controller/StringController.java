package cn.edu.tyut.controller;

import cn.edu.tyut.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

/**
 * @Author 羊羊
 * @ClassName StringController
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 20:28
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class StringController {
    @PostMapping("/showPageByRequest")
    public String showPageByRequest(@NotNull HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("username", "httpServletRequest");
        httpServletRequest.setAttribute("password", "String password");
        return "string01";
    }

    @GetMapping("/getString01")
    public String getString01() {
        System.out.println("访问到 string01.jsp 页面");
        return "string01";
    }

    @PostMapping("/showPageByModel")
    public String showPageByModel(@NotNull Model model) {
        User user = new User();
        user.setPassword("userPassword");
        user.setUsername("userName");
        model.addAttribute("username", model);
        model.addAttribute("user", user);
        return "string02";
    }

    @GetMapping("/getString02")
    public String getString02() {
        System.out.println("访问到 string02.jsp 页面");
        return "string02";
    }

    @PostMapping("/showModelAndView")
    public ModelAndView showModelAndView() {
        // ModelAndView 对象不能通过形参的方式传入，需要手动创建
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "string03");
        User user = new User();
        user.setPassword("password03");
        modelAndView.addObject("user", user);
        // 调用 ModelAndView 的 setViewName() 方法指定逻辑视图名称，添加的模型数据的值可以在跳转后的页面中以el表达式“${数据名称}”的方式取出
        modelAndView.setViewName("string03");
        return modelAndView;
    }

    @GetMapping("string03")
    public void getString03() {
        System.out.println("访问到 string03.jsp 页面");
    }
}
