package com.seapeng.BookSystem.service;

import com.seapeng.BookSystem.model.TInRecord;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/4.
 */
public interface IInRecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(int id,int bookid,int size);

    int insert(TInRecord record);

    int insertSelective(TInRecord record);

    TInRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TInRecord record);

    int updateByPrimaryKey(TInRecord record);

    List<TInRecord> selectAll();
}
