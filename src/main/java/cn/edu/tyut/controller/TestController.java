package cn.edu.tyut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 羊羊
 * @ClassName TestController
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 16:22
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public void test() {
        System.out.println("test success");
    }
}
