package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallAdmin;
import com.cskaoyan.mall.beans.CskaoyanMallAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallAdminMapper {
    long countByExample(CskaoyanMallAdminExample example);

    int deleteByExample(CskaoyanMallAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallAdmin record);

    int insertSelective(CskaoyanMallAdmin record);

    List<CskaoyanMallAdmin> selectByExample(CskaoyanMallAdminExample example);

    CskaoyanMallAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallAdmin record, @Param("example") CskaoyanMallAdminExample example);

    int updateByExample(@Param("record") CskaoyanMallAdmin record, @Param("example") CskaoyanMallAdminExample example);

    int updateByPrimaryKeySelective(CskaoyanMallAdmin record);

    int updateByPrimaryKey(CskaoyanMallAdmin record);
}