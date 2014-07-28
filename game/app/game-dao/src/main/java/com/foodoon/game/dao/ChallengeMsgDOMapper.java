package com.foodoon.game.dao;

import com.foodoon.game.dao.domain.ChallengeMsgDO;
import com.foodoon.game.dao.domain.ChallengeMsgDOCriteria;
import java.util.List;

public interface ChallengeMsgDOMapper {
    int countByExample(ChallengeMsgDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChallengeMsgDO record);

    int insertSelective(ChallengeMsgDO record);

    List<ChallengeMsgDO> selectByExample(ChallengeMsgDOCriteria example);

    ChallengeMsgDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChallengeMsgDO record);

    int updateByPrimaryKey(ChallengeMsgDO record);
}