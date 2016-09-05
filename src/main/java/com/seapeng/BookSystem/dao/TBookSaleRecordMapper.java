package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TBookSaleRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface TBookSaleRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookSaleRecord record);

    int insertSelective(TBookSaleRecord record);

    TBookSaleRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookSaleRecord record);

    int updateByPrimaryKey(TBookSaleRecord record);
}