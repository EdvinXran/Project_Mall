package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallSystem;
import com.cskaoyan.mall.beans.CskaoyanMallSystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallSystemMapper {
    long countByExample(CskaoyanMallSystemExample example);

    int deleteByExample(CskaoyanMallSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallSystem record);

    int insertSelective(CskaoyanMallSystem record);

    List<CskaoyanMallSystem> selectByExample(CskaoyanMallSystemExample example);

    CskaoyanMallSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallSystem record, @Param("example") CskaoyanMallSystemExample example);

    int updateByExample(@Param("record") CskaoyanMallSystem record, @Param("example") CskaoyanMallSystemExample example);

    int updateByPrimaryKeySelective(CskaoyanMallSystem record);

    int updateByPrimaryKey(CskaoyanMallSystem record);
}