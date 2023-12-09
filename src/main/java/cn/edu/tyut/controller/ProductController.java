package cn.edu.tyut.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName ProductController
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 15:45
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class ProductController {
    /**
     * 数组绑定
     * 返回值为void的页面转发。
     * SpringMVC会按照请求转发的方式跳转到·视图解析器前缀+映射路径+视图解析器后缀·的页面。
     * 需要使用@RequestParam注解来将请求参数与处理器的形参绑定，为什么value值为proIds呢？这是因为需要绑定的请求参数的name设置为proIds。
     * RequestParam注解是必须加的（因为我的编译器没有加-parameters）
     * @param proIds 表单返回的包含所有选中的proId的数组
     */
    @PostMapping("/arrayGetProducts")
    public void arrayGetProducts(@RequestParam("proIds") String @NotNull [] proIds) {
        for (String proId : proIds) {
            System.out.println("获取到id为：" + proId + "的商品");
        }
    }

    @GetMapping("/arrayProducts")
    public void arrayProducts() {
        System.out.println("展示出 arrayProducts.jsp 页面");
    }

    /**
     * 必须给处理器的形参添加@RequestParam注解标注
     * 因为如果不使用
     * @param proIds 传入的参数
     */
    @PostMapping("/setGetProducts")
    public void setGetProducts(@RequestParam("proIds") @NotNull List<String> proIds) {
        proIds.forEach(System.out::println);
    }

    @GetMapping("/setProducts")
    public void setProducts() {
        System.out.println("展示出 setProducts.jsp 页面");
    }
}
