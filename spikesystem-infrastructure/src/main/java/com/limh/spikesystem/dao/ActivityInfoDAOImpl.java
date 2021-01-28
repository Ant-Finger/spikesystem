package com.limh.spikesystem.dao;

import com.limh.spikesystem.activity.dao.ActivityInfoDAO;
import com.limh.spikesystem.activity.dto.ActivityInfoDTO;
import com.limh.spikesystem.converter.ActivityInfoConverter;
import com.limh.spikesystem.entity.ActivityInfoPO;
import com.limh.spikesystem.mapper.ActivityInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ActivityInfoDAOImpl implements ActivityInfoDAO {

    @Resource
    private ActivityInfoMapper  activityInfoMapper;
    @Resource
    private ActivityInfoConverter activityInfoConverter;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return activityInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ActivityInfoDTO activityInfoDTO) {
        ActivityInfoPO activityInfoPO =activityInfoConverter.dto2Po(activityInfoDTO);
        int num = activityInfoMapper.insert(activityInfoPO);
        //防止出现id未回填
        activityInfoDTO.setId(activityInfoPO.getId());
        return num;
    }

    @Override
    public int insertSelective(ActivityInfoDTO activityInfoDTO) {
        ActivityInfoPO activityInfoPO = activityInfoConverter.dto2Po(activityInfoDTO);
        int num = activityInfoMapper.insertSelective(activityInfoPO);
        activityInfoDTO.setId(activityInfoPO.getId());
        return num;
    }

    @Override
    public ActivityInfoDTO selectByPrimaryKey(Long id) {
        return activityInfoConverter.po2Dto(activityInfoMapper.selectByPrimaryKey(id));
    }

    @Override
    public int updateByPrimaryKeySelective(ActivityInfoDTO activityInfoDTO) {
        return activityInfoMapper.updateByPrimaryKeySelective(activityInfoConverter.dto2Po(activityInfoDTO));
    }

    @Override
    public int updateByPrimaryKey(ActivityInfoDTO activityInfoDTO) {

        return activityInfoMapper.updateByPrimaryKey(activityInfoConverter.dto2Po(activityInfoDTO));
    }
}
