package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallCart;
import com.cskaoyan.mall.beans.CskaoyanMallCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallCartMapper {
    long countByExample(CskaoyanMallCartExample example);

    int deleteByExample(CskaoyanMallCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallCart record);

    int insertSelective(CskaoyanMallCart record);

    List<CskaoyanMallCart> selectByExample(CskaoyanMallCartExample example);

    CskaoyanMallCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallCart record, @Param("example") CskaoyanMallCartExample example);

    int updateByExample(@Param("record") CskaoyanMallCart record, @Param("example") CskaoyanMallCartExample example);

    int updateByPrimaryKeySelective(CskaoyanMallCart record);

    int updateByPrimaryKey(CskaoyanMallCart record);
}