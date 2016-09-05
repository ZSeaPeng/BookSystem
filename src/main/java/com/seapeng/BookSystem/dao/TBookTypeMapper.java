package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TBookType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TBookTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookType record);

    int insertSelective(TBookType record);

    TBookType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookType record);

    int updateByPrimaryKey(TBookType record);

    List<TBookType> selectAll();
}