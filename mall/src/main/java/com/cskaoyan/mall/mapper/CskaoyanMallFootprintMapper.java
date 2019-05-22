package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallFootprint;
import com.cskaoyan.mall.beans.CskaoyanMallFootprintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallFootprintMapper {
    long countByExample(CskaoyanMallFootprintExample example);

    int deleteByExample(CskaoyanMallFootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallFootprint record);

    int insertSelective(CskaoyanMallFootprint record);

    List<CskaoyanMallFootprint> selectByExample(CskaoyanMallFootprintExample example);

    CskaoyanMallFootprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallFootprint record, @Param("example") CskaoyanMallFootprintExample example);

    int updateByExample(@Param("record") CskaoyanMallFootprint record, @Param("example") CskaoyanMallFootprintExample example);

    int updateByPrimaryKeySelective(CskaoyanMallFootprint record);

    int updateByPrimaryKey(CskaoyanMallFootprint record);
}