package com.limh.spikesystem.user.service.impl;

import com.limh.spikesystem.user.dao.UserDAO;
import com.limh.spikesystem.user.dto.UserDTO;
import com.limh.spikesystem.user.service.UserService;

import javax.annotation.Resource;

/**
 * @author Limh
 * @date 2021/1/29
 */
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    @Override
    public UserDTO queryUserInfoById(Long userId) {
        return userDAO.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addUser(UserDTO userDTO) {
        return userDAO.insert(userDTO)>0;
    }
}
