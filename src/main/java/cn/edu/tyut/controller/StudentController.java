package cn.edu.tyut.controller;

import cn.edu.tyut.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 羊羊
 * @ClassName StudentController
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 15:07
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class StudentController {
    @RequestMapping("/getRequestScope")
    public void getRequestScope(Student student) {
        System.out.println(student);
    }

    @RequestMapping("/getSessionScope")
    public void getSessionScope(Student student) {
        System.out.println(student);
    }
}
