package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallCollect;
import com.cskaoyan.mall.beans.CskaoyanMallCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallCollectMapper {
    long countByExample(CskaoyanMallCollectExample example);

    int deleteByExample(CskaoyanMallCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallCollect record);

    int insertSelective(CskaoyanMallCollect record);

    List<CskaoyanMallCollect> selectByExample(CskaoyanMallCollectExample example);

    CskaoyanMallCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallCollect record, @Param("example") CskaoyanMallCollectExample example);

    int updateByExample(@Param("record") CskaoyanMallCollect record, @Param("example") CskaoyanMallCollectExample example);

    int updateByPrimaryKeySelective(CskaoyanMallCollect record);

    int updateByPrimaryKey(CskaoyanMallCollect record);
}