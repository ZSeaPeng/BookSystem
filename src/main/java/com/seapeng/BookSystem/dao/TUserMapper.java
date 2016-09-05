package com.seapeng.BookSystem.dao;

import com.seapeng.BookSystem.model.TUser;
import org.springframework.stereotype.Repository;

@Repository()
public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser selectByUsername(TUser user);
}