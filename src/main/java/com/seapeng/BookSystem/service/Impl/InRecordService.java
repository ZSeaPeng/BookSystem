package com.seapeng.BookSystem.service.Impl;

import com.seapeng.BookSystem.dao.TBookInRecordMapper;
import com.seapeng.BookSystem.dao.TInRecordMapper;
import com.seapeng.BookSystem.model.TBookInRecord;
import com.seapeng.BookSystem.model.TInRecord;
import com.seapeng.BookSystem.service.IInRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/4.
 */
@Service
public class InRecordService implements IInRecordService {

    @Resource
    private TInRecordMapper inRecordMapper;

    @Resource
    private TBookInRecordMapper bookInRecordMapper;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(TInRecord record) {
        return inRecordMapper.insert(record);
    }

    public int insert(int id,int bookid,int size) {
        TBookInRecord bookInRecord = new TBookInRecord();
        bookInRecord.setBookIdFk(bookid);
        bookInRecord.settInRecordIdFk(id);
        bookInRecord.setInSum(size);
        bookInRecordMapper.insert(bookInRecord);
        return 0;
    }

    public int insertSelective(TInRecord record) {
        return 0;
    }

    public TInRecord selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(TInRecord record) {
        return 0;
    }

    public int updateByPrimaryKey(TInRecord record) {
        return 0;
    }

    public List<TInRecord> selectAll() {
        return inRecordMapper.selectAll();
    }
}
