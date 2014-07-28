package com.foodoon.game.dao;

import com.foodoon.game.dao.domain.TeamApplyDO;
import com.foodoon.game.dao.domain.TeamApplyDOCriteria;
import java.util.List;

public interface TeamApplyDOMapper {
    int countByExample(TeamApplyDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeamApplyDO record);

    int insertSelective(TeamApplyDO record);

    List<TeamApplyDO> selectByExample(TeamApplyDOCriteria example);

    TeamApplyDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamApplyDO record);

    int updateByPrimaryKey(TeamApplyDO record);
}