package com.seapeng.BookSystem.service;

import com.seapeng.BookSystem.model.TBook;
import com.seapeng.BookSystem.model.TBookType;
import com.seapeng.BookSystem.model.TPublisher;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
public interface IBookService {
    int deleteByPrimaryKey(Integer id);

    int insert(TBook record);

    int insertSelective(TBook record);

    TBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);

    List<TBook> selectAll();

    List<TBookType> getTypeList();

    List<TPublisher> getPubList();
}
