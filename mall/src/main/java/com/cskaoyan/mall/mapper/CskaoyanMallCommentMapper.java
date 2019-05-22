package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.beans.CskaoyanMallComment;
import com.cskaoyan.mall.beans.CskaoyanMallCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CskaoyanMallCommentMapper {
    long countByExample(CskaoyanMallCommentExample example);

    int deleteByExample(CskaoyanMallCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CskaoyanMallComment record);

    int insertSelective(CskaoyanMallComment record);

    List<CskaoyanMallComment> selectByExample(CskaoyanMallCommentExample example);

    CskaoyanMallComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CskaoyanMallComment record, @Param("example") CskaoyanMallCommentExample example);

    int updateByExample(@Param("record") CskaoyanMallComment record, @Param("example") CskaoyanMallCommentExample example);

    int updateByPrimaryKeySelective(CskaoyanMallComment record);

    int updateByPrimaryKey(CskaoyanMallComment record);
}