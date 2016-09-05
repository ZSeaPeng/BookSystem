package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TBookInRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface TBookInRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookInRecord record);

    int insertSelective(TBookInRecord record);

    TBookInRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookInRecord record);

    int updateByPrimaryKey(TBookInRecord record);


}