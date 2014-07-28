package com.foodoon.game.dao;

import com.foodoon.game.dao.domain.UserInfoDO;
import com.foodoon.game.dao.domain.UserInfoDOCriteria;
import java.util.List;

public interface UserInfoDOMapper {
    int countByExample(UserInfoDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoDO record);

    int insertSelective(UserInfoDO record);

    List<UserInfoDO> selectByExample(UserInfoDOCriteria example);

    UserInfoDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoDO record);

    int updateByPrimaryKey(UserInfoDO record);
}