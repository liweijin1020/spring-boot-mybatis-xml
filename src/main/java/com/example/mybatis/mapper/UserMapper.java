package com.example.mybatis.mapper;

import com.example.mybatis.model.User;

import java.util.List;

/**
 * @author norhtking
 */
public interface UserMapper {

    /**
     * 查所有用户
     * @return
     */
    List<User> getUserAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    User getOneUser(Long id);

    /**
     * 插入
     * @param user
     */
    void insert(User user);

    /**
     * 修改
     * @param user
     */
    void update(User user);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);
}
