package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallGrouponRules;
import com.cskaoyan.mall.beans.CskaoyanMallGrouponRulesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallGrouponRulesMapper {
    long countByExample(CskaoyanMallGrouponRulesExample example);

    int deleteByExample(CskaoyanMallGrouponRulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallGrouponRules record);

    int insertSelective(CskaoyanMallGrouponRules record);

    List<CskaoyanMallGrouponRules> selectByExample(CskaoyanMallGrouponRulesExample example);

    CskaoyanMallGrouponRules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallGrouponRules record, @Param("example") CskaoyanMallGrouponRulesExample example);

    int updateByExample(@Param("record") CskaoyanMallGrouponRules record, @Param("example") CskaoyanMallGrouponRulesExample example);

    int updateByPrimaryKeySelective(CskaoyanMallGrouponRules record);

    int updateByPrimaryKey(CskaoyanMallGrouponRules record);
}