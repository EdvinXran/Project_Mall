package com.cskaoyan.cskaoyanmall.mapper.user;

import com.cskaoyan.cskaoyanmall.beans.user.User;
import com.cskaoyan.cskaoyanmall.beans.user.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from cskaoyan_mall_user order by #{sort} #{order} limit #{start_i}, #{limit}" )
    List<User> selectPageList(@Param("start_i") int start_i, @Param("limit") int limit, @Param("sort") String sort, @Param("order") String order);
}