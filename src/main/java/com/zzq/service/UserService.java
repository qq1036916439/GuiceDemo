package com.zzq.service;


import com.google.inject.Inject;

import com.zzq.dao.UserDao;

/**
 * service，依赖 UserDao
 * @author zhangzhiqiang
 */
public class UserService {

    @Inject
    private UserDao mUserDao;

    public void say() {
        mUserDao.say();
    }
}
