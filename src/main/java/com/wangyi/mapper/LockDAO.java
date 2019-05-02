package com.wangyi.mapper;

import com.wangyi.entity.Lock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LockDAO {
    int deleteByPrimaryKey(String id);

    int insert(Lock record);

    int insertSelective(Lock record);

    Lock selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Lock record);

    int updateByPrimaryKey(Lock record);
}