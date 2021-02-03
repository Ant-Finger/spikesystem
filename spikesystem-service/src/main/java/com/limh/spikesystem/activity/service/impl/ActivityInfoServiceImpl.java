package com.limh.spikesystem.activity.service.impl;

import com.limh.spikesystem.activity.dao.ActivityInfoDAO;
import com.limh.spikesystem.activity.dto.ActivityInfoDTO;
import com.limh.spikesystem.activity.service.ActivityInfoService;
import com.limh.spikesystem.adapter.CacheAdapter;
import com.limh.spikesystem.common.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Limh
 * @date 2021/1/29
 */
@Service
public class ActivityInfoServiceImpl implements ActivityInfoService {


    @Resource

    private ActivityInfoDAO activityInfoDAO;

    @Resource
    private CacheAdapter cacheAdapter;

    private Logger logger = LoggerFactory.getLogger(ActivityInfoServiceImpl.class);

    /**
     * 查询所有有效的活动列表
     *
     * @return
     */
    @Override
    public List<ActivityInfoDTO> queryAllEffectiveActivity() {
        return activityInfoDAO.queryAllEffectiveActivity();
    }

    /**
     * 添加活动操作
     *
     * @param activityInfoDTO
     */
    @Transactional
    @Override
    public boolean addActivityInfo(ActivityInfoDTO activityInfoDTO) {
        int num;
        try {
            //增加活动
            num = activityInfoDAO.insertSelective(activityInfoDTO);
        } catch (Throwable e) {
            logger.error("ActivityInfoServiceImpl.addActivityInfo error", e);
            return false;
        }
        if (num <= 0) {
            return false;
        }
        try {
            //活动结束时间与当前时间的差值，则是缓存生效时间
            long timeout = activityInfoDTO.getEndTime().getTime() - System.currentTimeMillis();
            //将活动数量添加到缓存中
            cacheAdapter.set(Constant.REDIS_PREFIX_ACTIVITY_STOCK_NUMS + activityInfoDTO.getId(),
                    String.valueOf(activityInfoDTO.getStartTime().getTime()), timeout, TimeUnit.MILLISECONDS);
            //将活动开启时间添加到缓存中
            cacheAdapter.set(Constant.REDIS_PREFIX_ACTIVITY_STOCK_STARTTIME + activityInfoDTO.getId(),
                    String.valueOf(activityInfoDTO.getStartTime().getTime()), timeout, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            logger.error("cacheAdapter.set error!", e);
            throw new RuntimeException(e);
        }
        return true;
    }


    @Override
    public void deleteActivityInfo(Long activityId) {

    }

    @Override
    public void deduceProductNums(Long activityId) {

    }

    @Override
    public void increaseProductNums(Long activityId) {

    }

    @Override
    public boolean activityValid(Long activityId) {
        return false;
    }
}
