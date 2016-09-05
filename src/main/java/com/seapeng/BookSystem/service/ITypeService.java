package com.seapeng.BookSystem.service;

import com.seapeng.BookSystem.model.TBookType;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
public interface ITypeService {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookType record);

    int insertSelective(TBookType record);

    TBookType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookType record);

    int updateByPrimaryKey(TBookType record);

    List<TBookType> selectAll();
}
