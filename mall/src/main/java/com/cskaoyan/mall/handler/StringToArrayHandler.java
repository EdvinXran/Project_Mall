package com.cskaoyan.mall.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: Suzie Liao
 * @Date: 2019-05-23 20:49
 */
public class StringToArrayHandler extends BaseTypeHandler<String[]> {

    /*
         JavaBean的类型转换成数据库
         第一个参数：需要转换的数据所在数据库表的列数
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int index, String[] strings, JdbcType jdbcType) throws SQLException {
        StringBuffer stringBuffer = new StringBuffer();
        for (String dataFromWeb : strings) {
            stringBuffer.append(dataFromWeb).append("\",\"");
        }
        // 去掉末尾的,
        String dataIntoDataBase = stringBuffer.toString().substring(stringBuffer.length() - 1);
        preparedStatement.setString(index, dataIntoDataBase);
    }

    /*
        以下三个重写的方法均是：将数据库类型转换成JavaBean类型
        如：cskaoyanmall.cskaoyan_mall_goods表中gallery列为varchar
           前端显示为String[]
     */
    @Override
    public String[] getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
        String dataBaseString = resultSet.getString(columnLabel);
        // 去掉首尾的[""]
        int strLength = dataBaseString.length();
        dataBaseString = dataBaseString.substring(2, strLength - 2);

        String[] dataShowArray = dataBaseString.split("\", \"");
        return dataShowArray;
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int index) throws SQLException {
        String dataBaseString = resultSet.getString(index);

        // 去掉首尾的[""]
        int strLength = dataBaseString.length();
        dataBaseString = dataBaseString.substring(2, strLength - 2);

        String[] dataShowArray = dataBaseString.split("\", \"");
        return dataShowArray;
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int index) throws SQLException {
        String dataBaseString = callableStatement.getString(index);

        // 去掉首尾的[""]
        int strLength = dataBaseString.length();
        dataBaseString = dataBaseString.substring(2, strLength - 2);

        String[] dataShowArray = dataBaseString.split("\", \"");
        return dataShowArray;
    }
}
