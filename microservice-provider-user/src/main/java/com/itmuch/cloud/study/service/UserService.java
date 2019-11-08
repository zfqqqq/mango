package com.itmuch.cloud.study.service;

import com.itmuch.cloud.study.dao.UserDao;
import com.itmuch.cloud.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 86135 on 2019/10/12.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(Long id){
        return userDao.findUserById(id);
    }
}
