package cn.edu.tyut.controller;

import cn.edu.tyut.entity.User;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 羊羊
 * @ClassName JSONString
 * @SubmitTime 周日
 * @DATE 2023/12/10
 * @Time 15:07
 * @Package_Name cn.edu.tyut.controller
 */
@RestController
public class JsonString {
    @GetMapping("/jsonString")
    public String jsonString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "user");
        jsonObject.put("password", "jsonString");
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);
        // @RestController注解或者@ResponseBody注解会自动将返回值变为JSON格式
        System.out.println(jsonObject);
        System.out.println(jsonObject.toJSONString());
        System.out.println(jsonArray);
        System.out.println(jsonArray.toJSONString());
        return jsonObject + "   " + jsonArray;
    }


    /**
     * 如果设置了produces的值，将返回的内容类型设定为application/json，表示服务器端返回了一个JSON格式的数据（当然不设置也行，也能展示，但是展示的是JSON样式的字符串。这样是为了规范）
     * 然后我们在方法上添加一个@ResponseBody表示方法返回（也可以在类上添加@RestController表示此Controller默认返回的是字符串数据）的结果不是视图名称而是直接需要返回一个字符串作为页面数据，这样，返回给浏览器的就是我们直接返回的字符串内容。
     * 也可以直接返回一个对象，添加fastjson在Spring中的依赖，还需要配置可以转换JSON数据为JSON格式的消息类型转换器，那么便会自动转换为JSON字符串格式。
     *
     * @return 返回字符串
     */
    @GetMapping(value = "/entityJsonString", produces = "application/json")
    public String entityJsonString() {
        User user = new User();
        user.setUsername("returnEntityString");
        user.setPassword("entityJsonString");
        return JSON.toJSONString(user);
    }
}
