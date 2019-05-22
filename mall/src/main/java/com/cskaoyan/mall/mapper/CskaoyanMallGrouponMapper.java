package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallGroupon;
import com.cskaoyan.mall.beans.CskaoyanMallGrouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallGrouponMapper {
    long countByExample(CskaoyanMallGrouponExample example);

    int deleteByExample(CskaoyanMallGrouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallGroupon record);

    int insertSelective(CskaoyanMallGroupon record);

    List<CskaoyanMallGroupon> selectByExample(CskaoyanMallGrouponExample example);

    CskaoyanMallGroupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallGroupon record, @Param("example") CskaoyanMallGrouponExample example);

    int updateByExample(@Param("record") CskaoyanMallGroupon record, @Param("example") CskaoyanMallGrouponExample example);

    int updateByPrimaryKeySelective(CskaoyanMallGroupon record);

    int updateByPrimaryKey(CskaoyanMallGroupon record);
}