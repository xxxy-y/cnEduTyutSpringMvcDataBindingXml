package cn.edu.tyut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 羊羊
 * @ClassName InteceptorController
 * @SubmitTime 周二
 * @DATE 2023/12/12
 * @Time 16:10
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class InterceptorController {
    @GetMapping("/getInterceptor")
    public String getInterceptor() {
        System.out.println("get interceptor ... interceptor");
        return "success";
    }

    @GetMapping("/getExp")
    public String exp() {
        System.out.println(1 / 0);
        return "success";
    }
}