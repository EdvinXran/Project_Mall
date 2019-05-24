package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.promotion.CskaoyanMallAd;
import com.cskaoyan.mall.beans.promotion.CskaoyanMallAdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallAdMapper {
    long countByExample(CskaoyanMallAdExample example);

    int deleteByExample(CskaoyanMallAdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallAd record);

    int insertSelective(CskaoyanMallAd record);

    List<CskaoyanMallAd> selectByExample(CskaoyanMallAdExample example);

    CskaoyanMallAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallAd record, @Param("example") CskaoyanMallAdExample example);

    int updateByExample(@Param("record") CskaoyanMallAd record, @Param("example") CskaoyanMallAdExample example);

    int updateByPrimaryKeySelective(CskaoyanMallAd record);

    int updateByPrimaryKey(CskaoyanMallAd record);
}