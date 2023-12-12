package cn.edu.tyut.controller;

import cn.edu.tyut.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author 羊羊
 * @ClassName ExceptionController
 * @SubmitTime 周二
 * @DATE 2023/12/12
 * @Time 9:53
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class ExceptionController {
    @GetMapping("/showNullPointer")
    public void showNullPointer() {
        ArrayList<Object> list = null;
        System.out.println(list.get(2));
    }

    @GetMapping("/showIOException")
    public void showIoException() {
        try (FileInputStream in = new FileInputStream("JavaWeb.xml")) {
            System.out.println("IOException y");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/showArithmetic")
    public void showArithmetic() {
        int c = 1 / 0;
    }

    @GetMapping("/addData")
    public void addData() throws MyException {
        throw new MyException("新增数据异常...");
    }
}