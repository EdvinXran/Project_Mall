package com.cskaoyan.cskaoyanmall.mapper.promotion;

import com.cskaoyan.cskaoyanmall.beans.promotion.Ad;
import com.cskaoyan.cskaoyanmall.beans.promotion.AdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdMapper {
    long countByExample(AdExample example);

    int deleteByExample(AdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ad record);

    int insertSelective(Ad record);

    List<Ad> selectByExample(AdExample example);

    Ad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);
}