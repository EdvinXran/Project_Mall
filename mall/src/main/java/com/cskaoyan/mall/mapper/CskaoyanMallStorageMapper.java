package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallStorage;
import com.cskaoyan.mall.beans.CskaoyanMallStorageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallStorageMapper {
    long countByExample(CskaoyanMallStorageExample example);

    int deleteByExample(CskaoyanMallStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallStorage record);

    int insertSelective(CskaoyanMallStorage record);

    List<CskaoyanMallStorage> selectByExample(CskaoyanMallStorageExample example);

    CskaoyanMallStorage selectByPrimaryKey(Integer id);

    CskaoyanMallStorage selectByKey(String key);

    int updateByExampleSelective(@Param("record") CskaoyanMallStorage record, @Param("example") CskaoyanMallStorageExample example);

    int updateByExample(@Param("record") CskaoyanMallStorage record, @Param("example") CskaoyanMallStorageExample example);

    int updateByPrimaryKeySelective(CskaoyanMallStorage record);

    int updateByPrimaryKey(CskaoyanMallStorage record);
}