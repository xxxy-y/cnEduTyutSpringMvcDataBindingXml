package cn.edu.tyut.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 羊羊
 * @ClassName CustomInterceptor
 * @SubmitTime 周二
 * @DATE 2023/12/12
 * @Time 15:27
 * @Package_Name cn.edu.tyut.interceptor
 */
public class CustomInterceptor01 implements HandlerInterceptor {
    @Override
    public boolean preHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        return true;
    }
}
