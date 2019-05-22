package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallKeyword;
import com.cskaoyan.mall.beans.CskaoyanMallKeywordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallKeywordMapper {
    long countByExample(CskaoyanMallKeywordExample example);

    int deleteByExample(CskaoyanMallKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallKeyword record);

    int insertSelective(CskaoyanMallKeyword record);

    List<CskaoyanMallKeyword> selectByExample(CskaoyanMallKeywordExample example);

    CskaoyanMallKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallKeyword record, @Param("example") CskaoyanMallKeywordExample example);

    int updateByExample(@Param("record") CskaoyanMallKeyword record, @Param("example") CskaoyanMallKeywordExample example);

    int updateByPrimaryKeySelective(CskaoyanMallKeyword record);

    int updateByPrimaryKey(CskaoyanMallKeyword record);
}