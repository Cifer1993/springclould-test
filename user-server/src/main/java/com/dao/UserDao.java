package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2018/10/29.
 */

@Mapper
public interface UserDao {

    User queryUserById(Long id);
}
