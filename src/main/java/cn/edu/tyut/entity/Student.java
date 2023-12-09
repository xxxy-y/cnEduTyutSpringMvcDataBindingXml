package cn.edu.tyut.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周五
 * @DATE 2023/12/8
 * @Time 21:04
 * @Package_Name cn.edu.tyut.entity
 */
@SessionScope
public class Student {
    private String name;
}
