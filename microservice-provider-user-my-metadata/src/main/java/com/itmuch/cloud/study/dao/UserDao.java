package com.itmuch.cloud.study.dao;

import com.itmuch.cloud.study.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by 86135 on 2019/10/12.
 */
@Repository
@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    public User findUserById(@Param("id") Long id);
}
