package cn.edu.tyut.controller;

import cn.edu.tyut.entity.Customer01;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 羊羊
 * @ClassName CustomerController
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 17:00
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class CustomerController {
    @PostMapping("/findOrderWithCustomer")
    public void findOrderWithCustomer(@NotNull Customer01 customer01) {
        String username = customer01.getUsername();
        String orderId = customer01.getOrder().getOrderId();
        System.out.println("username = " + username + ", orderId = " + orderId);
    }

    @GetMapping("/order")
    public void order() {
        System.out.println("成功访问到 orderCustomer01.jsp 页面");
    }
}