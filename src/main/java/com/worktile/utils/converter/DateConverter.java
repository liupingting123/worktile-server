package com.worktile.utils.converter;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by 67594 on 2016/11/1.
 */
public class DateConverter implements Converter<String, Date> {

    /**
     * 从字符串类型的日期转换成 Date 类型的日期
     */
    public Date convert(String source) {

        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
