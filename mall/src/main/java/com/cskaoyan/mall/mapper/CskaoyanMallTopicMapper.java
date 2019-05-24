package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallTopic;
import com.cskaoyan.mall.beans.CskaoyanMallTopicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallTopicMapper {
    long countByExample(CskaoyanMallTopicExample example);

    int deleteByExample(CskaoyanMallTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallTopic record);

    int insertSelective(CskaoyanMallTopic record);

    List<CskaoyanMallTopic> selectByExampleWithBLOBs(CskaoyanMallTopicExample example);

    List<CskaoyanMallTopic> selectByExample(CskaoyanMallTopicExample example);

    CskaoyanMallTopic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallTopic record, @Param("example") CskaoyanMallTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") CskaoyanMallTopic record, @Param("example") CskaoyanMallTopicExample example);

    int updateByExample(@Param("record") CskaoyanMallTopic record, @Param("example") CskaoyanMallTopicExample example);

    int updateByPrimaryKeySelective(CskaoyanMallTopic record);

    int updateByPrimaryKeyWithBLOBs(CskaoyanMallTopic record);

    int updateByPrimaryKey(CskaoyanMallTopic record);
}