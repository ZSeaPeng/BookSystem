package com.seapeng.BookSystem.service;

import com.seapeng.BookSystem.model.TPublisher;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
public interface ITPublisherService {
        List<TPublisher> selectAll();
        int deleteByPrimaryKey(Integer id);

        int insert(TPublisher record);

        int insertSelective(TPublisher record);

        TPublisher selectByPrimaryKey(Integer id);

        int updateByPrimaryKeySelective(TPublisher record);

        int updateByPrimaryKey(TPublisher record);

        List<TPublisher> selectByName(String name);
}
