package com.seapeng.BookSystem.service.Impl;

import com.seapeng.BookSystem.dao.TBookTypeMapper;
import com.seapeng.BookSystem.model.TBookType;
import com.seapeng.BookSystem.service.ITypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Service
public class TypeService implements ITypeService {

    @Resource
    private TBookTypeMapper typeMapper;

    public int deleteByPrimaryKey(Integer id) {
        return typeMapper.deleteByPrimaryKey(id);
    }

    public int insert(TBookType record) {
        return typeMapper.insert(record);
    }

    public int insertSelective(TBookType record) {
        return 0;
    }

    public TBookType selectByPrimaryKey(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(TBookType record) {
        return 0;
    }

    public int updateByPrimaryKey(TBookType record) {
        return typeMapper.updateByPrimaryKey(record);
    }
    public List<TBookType> selectAll(){
        return typeMapper.selectAll();
    }
}
