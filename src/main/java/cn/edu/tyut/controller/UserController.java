package cn.edu.tyut.controller;

import cn.edu.tyut.entity.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Author 羊羊
 * @ClassName UserController
 * @SubmitTime 周四
 * @DATE 2023/12/7
 * @Time 21:39
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class UserController {
    @RequestMapping("/registerUser")
    public String registerUser(@NotNull User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println(user);
        System.out.println(username + "------" + password);
        return "register";
    }

    /**
     * 当使用SpringMVC默认支持的数据类型作为处理器的形参类型时，SpringMVC的参数处理适配器会默认识别这些类型并进行赋值
     * 常见的默认类型：
     * httpServletRequest:获取请求信息
     * httpServletResponse:处理响应信息
     * HttpSession:获取session中存放的对象
     * Model/ModelMap:Model是一个接口，ModelMap是一个类，Model的实现类对象和ModelMap对象都可以设置model数据，model数据会填充到request域
     *
     * @param httpServletRequest 获取到请求信息
     */
    @RequestMapping("/getUserId")
    public void getUserId(@NotNull HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        System.out.println("username = " + username);
    }

    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId(@RequestParam("username") String username, @RequestParam(value = "id", required = false, defaultValue = "20") Integer id) {
        System.out.println("username = " + username + " ------ password = " + id);
    }

    @RequestMapping("/user/{name}")
    public void getPathVariable(@PathVariable("name") String username) {
        System.out.println("username = " + username);
    }

    @RequestMapping("/getBirthday")
    public void getBirthday(@RequestParam("birthday") @DateTimeFormat(pattern = "yyyy-MM-yy") Date birthday) {
        System.out.println("Birthday : " + birthday);
    }

    @GetMapping("/setCookie")
    public void setCookie(@NotNull HttpServletResponse httpServletResponse) {
        httpServletResponse.addCookie(new Cookie("testGetCookie", "testGetCookie"));
    }

    @GetMapping("/getCookie")
    public ModelAndView getCookie(@CookieValue(value = "test01", required = false) String value) {
        System.out.println(value);
        return new ModelAndView("register");
    }

    @GetMapping("/setSession")
    public void setSession(@NotNull HttpSession httpSession) {
        httpSession.setAttribute("testGetSession", "testGetSession");
    }

    @GetMapping("getSession")
    public ModelAndView getSession(@SessionAttribute(value = "testGetSession", required = false) String value) {
        System.out.println(value);
        return new ModelAndView("register");
    }

    /**
     * 请求转发时，SpringMVC会将请求转发到homeForward页面，网页上的网络地址不会发生改变
     * @return SpringMVC将请求转发到homeForward页面
     */
    @GetMapping("/forward")
    public String forward() {
        System.out.println("forward");
        return "forward:homeForward";
    }

    @GetMapping("/homeForward")
    public String homeForward() {
        return "homeForward";
    }

    /**
     * 实现重定向：它会更改网页上的网页地址，改为请求转发到的网络地址
     * 重定向是通过发送新的HTTP请求来实现页面跳转，而请求转发是服务器内部的跳转，不会发送新的HTTP请求。
     * 重定向可以跳转到不同的域名或者不同的应用程序，而请求转发只能在同一个应用程序内进行跳转。
     * 重定向可以实现客户端的跳转，而请求转发只能在服务器端进行跳转。
     *
     * @return 重定向到testRedirect页面
     */
    @GetMapping("/redirect")
    public String redirect() {
        System.out.println("redirect");
        return "redirect:homeRedirect";
    }

    @RequestMapping("/homeRedirect")
    public String home() {
        return "homeRedirect";
    }
}