package com.seapeng.BookSystem.service.Impl;

import com.seapeng.BookSystem.dao.TBookSaleRecordMapper;
import com.seapeng.BookSystem.dao.TSaleRecordMapper;
import com.seapeng.BookSystem.model.TBookSaleRecord;
import com.seapeng.BookSystem.model.TSaleRecord;
import com.seapeng.BookSystem.service.ISaleRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/2.
 */
@Service
public class SaleRecordService implements ISaleRecordService {

   @Resource
   private TSaleRecordMapper saleRecordMapper;
    @Resource
    private TBookSaleRecordMapper bookSaleRecordMapper;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(TSaleRecord record) {

        return saleRecordMapper.insert(record);
    }

    public int insertSelective(TSaleRecord record) {
        return 0;
    }

    public TSaleRecord selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(TSaleRecord record) {
        return 0;
    }

    public int updateByPrimaryKey(TSaleRecord record) {
        return 0;
    }

    public List<TSaleRecord> selectAll() {
        return saleRecordMapper.selectAll();
    }

    public int insert(int id,int bookid,int size) {
        TBookSaleRecord bookSaleRecord= new TBookSaleRecord();
        bookSaleRecord.setBookIdFk(bookid);
        bookSaleRecord.settSaleRecordIdFk(id);
        bookSaleRecord.setTradeSum(size);
        bookSaleRecordMapper.insert(bookSaleRecord);
        return 0;
    }
}
