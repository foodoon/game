package com.foodoon.game.dao;

import com.foodoon.game.dao.domain.TeamRecruitDO;
import com.foodoon.game.dao.domain.TeamRecruitDOCriteria;
import java.util.List;

public interface TeamRecruitDOMapper {
    int countByExample(TeamRecruitDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeamRecruitDO record);

    int insertSelective(TeamRecruitDO record);

    List<TeamRecruitDO> selectByExample(TeamRecruitDOCriteria example);

    TeamRecruitDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamRecruitDO record);

    int updateByPrimaryKey(TeamRecruitDO record);
}