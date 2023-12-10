package cn.edu.tyut.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

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
}
