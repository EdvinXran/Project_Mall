package com.cskaoyan.mall.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author: Tangxuan
 * @Date: 2019/5/23 21:21
 */
public  class FormatDate {
    public static Date GetNow(){
        //获取北京时间，并格式化
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        try {
            //将格式化的字符串日期转化为日期类型
            return dateFormat.parse(dateFormat.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
