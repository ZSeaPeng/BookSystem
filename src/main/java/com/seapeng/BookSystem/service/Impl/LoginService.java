package com.seapeng.BookSystem.service.Impl;

import com.seapeng.BookSystem.dao.TUserMapper;
import com.seapeng.BookSystem.model.TUser;
import com.seapeng.BookSystem.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Service
public class LoginService implements ILoginService {
    @Resource
    private TUserMapper userMapper;

    public TUser selectByUsername(TUser user) {
        return userMapper.selectByUsername(user);
    }

    public TUser selectByPrimaryKey(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
