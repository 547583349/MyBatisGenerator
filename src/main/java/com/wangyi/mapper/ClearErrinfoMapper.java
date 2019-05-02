package com.wangyi.mapper;

import com.wangyi.entity.ClearErrinfo;

public interface ClearErrinfoMapper {
    int deleteByPrimaryKey(String errinfoId);

    int insert(ClearErrinfo record);

    int insertSelective(ClearErrinfo record);

    ClearErrinfo selectByPrimaryKey(String errinfoId);

    int updateByPrimaryKeySelective(ClearErrinfo record);

    int updateByPrimaryKey(ClearErrinfo record);
}