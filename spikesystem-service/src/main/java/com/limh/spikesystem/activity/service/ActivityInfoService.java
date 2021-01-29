package com.limh.spikesystem.activity.service;

import com.limh.spikesystem.activity.dto.ActivityInfoDTO;

import java.util.List;

/**
 * @author Limh
 * @date 2021/1/29
 * 服务接口定义
 */
public interface ActivityInfoService {
    /**
     * 获取所有有效的活动列表
     * @return
     */
   List<ActivityInfoDTO> queryAllEffectiveActivity();
}
