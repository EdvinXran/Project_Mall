package com.cskaoyan.cskaoyanmall.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by little Stone
 * Date 2019/5/23 Time 14:46
 */
public class StringToArrayHandler extends BaseTypeHandler<String[]> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int index, String[] strings, JdbcType jdbcType) throws SQLException {
        //javabean的类型转换成数据库
        //第一个参数是你需要转换的数据所在数据库表的列数

        String hobbyString ="";
        if(strings!=null){//不为空，用，拼接；为空则返回空字符串
            StringBuffer sb = new StringBuffer();
            for (String hobby:strings) {
                sb.append(hobby).append(",");
            }
            hobbyString = sb.toString().substring(sb.length() - 1);
            System.out.println(hobbyString);
        }

        preparedStatement.setString(index,hobbyString);
    }

    //将数据库类型转换成javabean类型
    @Override
    public String[] getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
        String hobbyString = resultSet.getString(columnLabel);
        String[] hobbyArray = hobbyString.split(",");
        return hobbyArray;
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int index) throws SQLException {
        String hobbyString = resultSet.getString(index);
        String[] hobbyArray = hobbyString.split(",");
        return hobbyArray;
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String hobbyString = callableStatement.getString(i);
        String[] hobbyArray = hobbyString.split(",");
        return hobbyArray;
    }
}
