package com.seapeng.BookSystem.service.Impl;

import com.seapeng.BookSystem.dao.TPublisherMapper;
import com.seapeng.BookSystem.model.TPublisher;
import com.seapeng.BookSystem.service.ITPublisherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Service
public class TPublisherService implements ITPublisherService{
    @Resource
    private TPublisherMapper publisherMapper;


    public List<TPublisher> selectAll() {
        //分页
        //PageHelper.startPage(1,2);
        return publisherMapper.selectAll();
    }

    public int deleteByPrimaryKey(Integer id) {
        return publisherMapper.deleteByPrimaryKey(id);
    }

    public int insert(TPublisher record) {
        return publisherMapper.insert(record);
    }

    public int insertSelective(TPublisher record) {
        return 0;
    }

    public TPublisher selectByPrimaryKey(Integer id) {
        return publisherMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(TPublisher record) {
        return 0;
    }

    public int updateByPrimaryKey(TPublisher record) {
        return publisherMapper.updateByPrimaryKey(record);
    }

    public List<TPublisher> selectByName(String name) {
        return publisherMapper.selectByName(name);
    }
}
