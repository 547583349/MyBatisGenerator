package com.wangyi.mapper;

import com.wangyi.entity.CarGroup;
import com.wangyi.entity.CarGroupWithBLOBs;

public interface CarGroupDAO {
    int deleteByPrimaryKey(String id);

    int insert(CarGroupWithBLOBs record);

    int insertSelective(CarGroupWithBLOBs record);

    CarGroupWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CarGroupWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CarGroupWithBLOBs record);

    int updateByPrimaryKey(CarGroup record);
}