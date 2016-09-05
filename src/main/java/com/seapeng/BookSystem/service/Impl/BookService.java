package com.seapeng.BookSystem.service.Impl;

import com.seapeng.BookSystem.dao.TBookMapper;
import com.seapeng.BookSystem.dao.TBookTypeMapper;
import com.seapeng.BookSystem.dao.TPublisherMapper;
import com.seapeng.BookSystem.model.TBook;
import com.seapeng.BookSystem.model.TBookType;
import com.seapeng.BookSystem.model.TPublisher;
import com.seapeng.BookSystem.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Service
public class BookService implements IBookService {
    @Resource
    private TBookMapper bookMapper;
    @Resource
    private TBookTypeMapper typeMapper;
    @Resource
    private TPublisherMapper publisherMapper;

    public int deleteByPrimaryKey(Integer id) {
        return bookMapper.deleteByPrimaryKey(id);
    }

    public int insert(TBook record) {
        return 0;
    }

    public int insertSelective(TBook record) {
        return bookMapper.insertSelective(record);
    }

    public TBook selectByPrimaryKey(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(TBook record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TBook record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    public List<TBook> selectAll() {
        return bookMapper.selectAll();
    }

    public List<TBookType> getTypeList(){
        return typeMapper.selectAll();
    }

    public List<TPublisher> getPubList() {
        return publisherMapper.selectAll();
    }

}
