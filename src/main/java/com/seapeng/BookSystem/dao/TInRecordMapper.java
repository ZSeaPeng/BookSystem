package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TInRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TInRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TInRecord record);

    int insertSelective(TInRecord record);

    TInRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TInRecord record);

    int updateByPrimaryKey(TInRecord record);

    List<TInRecord> selectAll();
}