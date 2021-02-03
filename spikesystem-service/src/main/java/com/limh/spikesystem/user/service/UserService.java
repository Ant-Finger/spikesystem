package com.limh.spikesystem.user.service;

import com.limh.spikesystem.user.dto.UserDTO;

/**
 * @author Limh
 * @date 2021/1/29
 */
public interface UserService {
    /**
     * 通过id查找用户详情信息，包含联系方式等
     *
     * @param userId
     * @return
     */
    UserDTO queryUserInfoById(Long userId);

    /**
     * 新增用户
     *
     * @param userDTO
     * @return
     */
    boolean addUser(UserDTO userDTO);

    /**
     * 通过userid来删除用户（不是重点，省略）
     *
     * @param userId
     * @return
     */
    // boolean delUserById(Long userId);

    /**
     * 修改用户（不是重点，省略）
     *
     * @param userDTO
     * @return
     */
    // boolean modifyUser(UserDTO userDTO);

}
