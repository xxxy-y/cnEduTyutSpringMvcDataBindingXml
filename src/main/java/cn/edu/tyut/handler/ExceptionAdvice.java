package cn.edu.tyut.handler;

import cn.edu.tyut.exception.MyException;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @Author 羊羊
 * @ClassName ExceptionAdvice
 * @SubmitTime 周二
 * @DATE 2023/12/12
 * @Time 10:48
 * @Package_Name cn.edu.tyut.handler
 */
@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(MyException.class)
    public ModelAndView doMyException(@NotNull MyException ex) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", ex.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView doOtherException(Exception ex) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",  "网络异常...");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
