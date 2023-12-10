package cn.edu.tyut.controller;

import cn.edu.tyut.entity.Product;
import cn.edu.tyut.entity.User;
import com.alibaba.fastjson2.JSON;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 羊羊
 * @ClassName DataController
 * @SubmitTime 周日
 * @DATE 2023/12/10
 * @Time 14:22
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class DataController {
    @GetMapping("/showDataByResponse")
    public void showDataByResponse(@NotNull HttpServletResponse httpServletResponse) {
        try {
            // 写入响应对象中
            httpServletResponse.getWriter().println("response, Show Data By Response");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/showDataByJson1")
    public void showDataByJson1(@NotNull HttpServletResponse httpServletResponse) {
        User user = new User();
        user.setUsername("show Data By Json01");
        user.setPassword("66666");
        try {
            httpServletResponse.getWriter().println(JSON.toJSONString(user));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 因为调用了@ResponseBody注解,所以会返回JSON类型的User消息
     * @return 返回JSON类型的User消息
     */
    @GetMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setUsername("getUser");
        return user;
    }

    /**
     * 因为调用了@ResponseBody注解,所以会返回JSON类型的List<Product>消息
     * @return 返回JSON类型的List<Product>消息
     */
    @GetMapping("/addProducts")
    @ResponseBody
    public List<Product> addProducts() {
        Product p1 = new Product();
        p1.setProId("p001");
        p1.setProName("p1Name");
        Product p2 = new Product();
        p2.setProId("p002");
        p2.setProName("p2Name");
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(p1);
        productArrayList.add(p2);
        return productArrayList;
    }
}