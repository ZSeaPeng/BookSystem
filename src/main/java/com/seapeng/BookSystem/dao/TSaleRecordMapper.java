package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TSaleRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TSaleRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSaleRecord record);

    int insertSelective(TSaleRecord record);

    TSaleRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSaleRecord record);

    int updateByPrimaryKey(TSaleRecord record);

    List<TSaleRecord> selectAll();
}