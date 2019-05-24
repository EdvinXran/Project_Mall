package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallRole;
import com.cskaoyan.mall.beans.CskaoyanMallRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallRoleMapper {
    long countByExample(CskaoyanMallRoleExample example);

    int deleteByExample(CskaoyanMallRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallRole record);

    int insertSelective(CskaoyanMallRole record);

    List<CskaoyanMallRole> selectByExample(CskaoyanMallRoleExample example);

    CskaoyanMallRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallRole record, @Param("example") CskaoyanMallRoleExample example);

    int updateByExample(@Param("record") CskaoyanMallRole record, @Param("example") CskaoyanMallRoleExample example);

    int updateByPrimaryKeySelective(CskaoyanMallRole record);

    int updateByPrimaryKey(CskaoyanMallRole record);
}