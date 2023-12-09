package cn.edu.tyut.convert;

import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author 羊羊
 * @ClassName DataConvert
 * @SubmitTime 周五
 * @DATE 2023/12/8
 * @Time 10:38
 * @Package_Name cn.edu.tyut.convert
 */

/**
 * 自定义日期转换器
 */
public class DataConvert implements Converter<String, Data> {
    @Override
    public Data convert(@NotNull String source) {
        String dataPattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataPattern);
        try {
            return (Data) simpleDateFormat.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
