package cn.edu.tyut.handler;

import cn.edu.tyut.exception.MyException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * @Author 羊羊
 * @ClassName MyExceptionHandler
 * @SubmitTime 周二
 * @DATE 2023/12/12
 * @Time 10:32
 * @Package_Name cn.edu.tyut.handler
 */
@Component
public class MyExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, Object handler, @NotNull Exception ex) {
        String msg;
        if (ex instanceof MyException) {
            msg = ex.getMessage();
        } else {
            Writer out = new StringWriter();
            PrintWriter s = new PrintWriter(out);
            ex.printStackTrace(s);
            String sysMsg = out.toString();
            msg = "网络异常";
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
