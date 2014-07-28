package com.foodoon.game.biz.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodoon.game.biz.UserInfoBiz;
import com.foodoon.game.dao.UserInfoDOMapper;
import com.foodoon.game.dao.domain.UserInfoDO;
import com.foodoon.game.dao.domain.UserInfoDOCriteria;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public class UserInfoBizImpl implements UserInfoBiz{

    private final static Logger logger = LoggerFactory.getLogger(UserInfoBizImpl.class);

    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    public BizResult detail(int id) {
        BizResult bizResult = new BizResult();
        try{
            UserInfoDO userInfoDO = userInfoDOMapper.selectByPrimaryKey(id);
            bizResult.data.put("userInfoDO", userInfoDO);
            bizResult.success = true;
        }catch(Exception e){
            logger.error("query UserInfo error",e);
        }
        return bizResult;
}

    public BizResult list(BaseQuery baseQuery) {
        BizResult bizResult = new BizResult();
        try {
            UserInfoDOCriteria userInfoDOCriteria = new UserInfoDOCriteria();
            userInfoDOCriteria.setStartRow(baseQuery.getStartRow());
            userInfoDOCriteria.setPageSize(baseQuery.getPageSize());
            int totalCount = userInfoDOMapper.countByExample(userInfoDOCriteria);
            baseQuery.setTotalCount(totalCount);
            List<UserInfoDO> userInfoDOList = userInfoDOMapper.selectByExample(userInfoDOCriteria);
            bizResult.data.put("userInfoDOList", userInfoDOList);
            bizResult.data.put("query", baseQuery);
            bizResult.success = true;
        } catch (Exception e) {
            logger.error("view UserInfo list error", e);
        }
            return bizResult;
     }

    public BizResult delete(int id) {
        BizResult bizResult = new BizResult();
        try {
            userInfoDOMapper.deleteByPrimaryKey(id);
            bizResult.success = true;
        } catch (Exception e) {
            logger.error("delete userInfo error", e);
        }
        return bizResult;
    }

    public BizResult create(UserInfoDO userInfoDO) {
        BizResult bizResult = new BizResult();
        try {
            int id = userInfoDOMapper.insert(userInfoDO);
            bizResult.data.put("id", id);
            bizResult.success = true;
        } catch (Exception e) {
            logger.error("create UserInfo error", e);
        }
        return bizResult;
    }

    public BizResult update(UserInfoDO userInfoDO) {
        BizResult bizResult = new BizResult();
        try {
            int id = userInfoDOMapper.updateByPrimaryKeySelective(userInfoDO);
            bizResult.data.put("id", id);
            bizResult.success = true;
        } catch (Exception e) {
            logger.error("update UserInfo error", e);
        }
        return bizResult;
    }

    }
