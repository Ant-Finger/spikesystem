package com.limh.spikesystem.controller;

import com.limh.spikesystem.activity.dto.ActivityInfoDTO;
import com.limh.spikesystem.activity.service.ActivityInfoService;
import com.limh.spikesystem.common.Constant;
import com.limh.spikesystem.dto.BaseResponse;
import com.limh.spikesystem.entity.ActivityInfoPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Limh
 * @date 2021/1/29
 * 活动管理Controller
 */
@RestController
public class ActivityInfoController {
    private static  final Logger log = LoggerFactory.getLogger(ActivityInfoController.class);
    @Resource
    private ActivityInfoService activityInfoService;
    /**
     * 获取所有活动列表信息
     */
    @RequestMapping(value= Constant.HTTP_PREFIX+"/activity/list")
    public BaseResponse queryActivityList(){
        BaseResponse baseResponse = BaseResponse.getSuccessResponse();
        List<ActivityInfoDTO> activityInfoDtos= activityInfoService.queryAllEffectiveActivity();
        baseResponse.setData(activityInfoDtos);
        return baseResponse;
    }
}
