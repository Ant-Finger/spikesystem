package com.limh.spikesystem.dao;

import com.limh.spikesystem.converter.UserConverter;
import com.limh.spikesystem.entity.UserPO;
import com.limh.spikesystem.mapper.UserMapper;
import com.limh.spikesystem.user.dao.UserDAO;
import com.limh.spikesystem.user.dto.UserDTO;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2021/2/3
 */
@Service
public class UserDAOImpl implements UserDAO {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserConverter userConverter;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserDTO userDTO) {
        UserPO userPO = userConverter.dto2Po(userDTO);
        int num = userMapper.insert(userPO);
        userDTO.setId(userPO.getId());
        return num;
    }

    @Override
    public int insertSelective(UserDTO userDTO) {
        UserPO userPO = userConverter.dto2Po(userDTO);
        int num = userMapper.insertSelective(userPO);
        userDTO.setId(userPO.getId());
        return num;
    }

    @Override
    public UserDTO selectByPrimaryKey(Long id) {
        return userConverter.po2Dto(userMapper.selectByPrimaryKey(id));
    }

    @Override
    public int updateByPrimaryKeySelective(UserDTO userDTO) {
        return userMapper.updateByPrimaryKeySelective(userConverter.dto2Po(userDTO));
    }

    @Override
    public int updateByPrimaryKey(UserDTO userDTO) {
        return userMapper.updateByPrimaryKey(userConverter.dto2Po(userDTO));
    }
}
