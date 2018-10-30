package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/10/29.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    @Transactional
    public User getUserById(Long id){
        return userdao.SelectUserById(id);
    }
}
