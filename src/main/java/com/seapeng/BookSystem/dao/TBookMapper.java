package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TBook;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBook record);

    int insertSelective(TBook record);

    TBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);

    List<TBook> selectAll();

    List<TBook> selectByName(String name);
}