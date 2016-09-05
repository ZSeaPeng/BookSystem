package com.seapeng.BookSystem.service;

import com.seapeng.BookSystem.model.TUser;

/**
 * Created by zseapeng on 2016/9/1.
 */
public interface ILoginService {
    TUser selectByUsername(TUser user);
    TUser selectByPrimaryKey(Integer id);
}
