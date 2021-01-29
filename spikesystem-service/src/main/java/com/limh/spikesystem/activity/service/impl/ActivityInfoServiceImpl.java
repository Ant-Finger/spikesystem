package com.limh.spikesystem.activity.service.impl;

import com.limh.spikesystem.activity.dao.ActivityInfoDAO;
import com.limh.spikesystem.activity.dto.ActivityInfoDTO;
import com.limh.spikesystem.activity.service.ActivityInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Limh
 * @date 2021/1/29
 */
@Service
public class ActivityInfoServiceImpl implements ActivityInfoService {


    @Resource

    private ActivityInfoDAO activityInfoDAO;

    @Override
    public List<ActivityInfoDTO> queryAllEffectiveActivity() {
        return activityInfoDAO.queryAllEffectiveActivity();
    }
}
