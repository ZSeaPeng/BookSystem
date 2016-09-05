package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TPublisher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TPublisherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPublisher record);

    int insertSelective(TPublisher record);

    TPublisher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPublisher record);

    int updateByPrimaryKey(TPublisher record);

    List<TPublisher> selectAll();

    List<TPublisher> selectByName(String name);

    int updateStatusByPrimaryKey(Integer id);
}