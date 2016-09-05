package com.seapeng.BookSystem.service;

import com.seapeng.BookSystem.model.TSaleRecord;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/2.
 */
public interface ISaleRecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(TSaleRecord record);

    int insertSelective(TSaleRecord record);

    TSaleRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSaleRecord record);

    int updateByPrimaryKey(TSaleRecord record);

    List<TSaleRecord> selectAll();
}
