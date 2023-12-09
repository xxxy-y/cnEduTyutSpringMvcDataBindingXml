package cn.edu.tyut.controller;

import cn.edu.tyut.entity.Customer02;
import cn.edu.tyut.entity.Order;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName OrderController
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 19:09
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class OrderController {
    @PostMapping("/showOrders")
    public void showOrders(@NotNull Customer02 customer02) {
        List<Order> orders = customer02.getOrders();
        List<String> addressList = customer02.getAddress();
        System.out.println("订单总数：" + orders.size());
        System.out.println("订单:");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.size());
            Order order = orders.get(i);
            String address = addressList.get(i);
            System.out.println("订单Id:" + order.getOrderId());
            System.out.println("订单配送地址:" + address);
        }
    }

    @GetMapping("/orderCustomer02")
    public void getOrderCustomer02() {
        System.out.println("访问到 orderCustomer02.jsp 页面");
    }
}
