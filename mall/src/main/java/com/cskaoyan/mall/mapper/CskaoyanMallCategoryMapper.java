package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallCategory;
import com.cskaoyan.mall.beans.CskaoyanMallCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallCategoryMapper {
    long countByExample(CskaoyanMallCategoryExample example);

    int deleteByExample(CskaoyanMallCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallCategory record);

    int insertSelective(CskaoyanMallCategory record);

    List<CskaoyanMallCategory> selectByExample(CskaoyanMallCategoryExample example);

    CskaoyanMallCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallCategory record, @Param("example") CskaoyanMallCategoryExample example);

    int updateByExample(@Param("record") CskaoyanMallCategory record, @Param("example") CskaoyanMallCategoryExample example);

    int updateByPrimaryKeySelective(CskaoyanMallCategory record);

    int updateByPrimaryKey(CskaoyanMallCategory record);
}