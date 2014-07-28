package com.foodoon.game.dao;

import com.foodoon.game.dao.domain.OrderInfoDO;
import com.foodoon.game.dao.domain.OrderInfoDOCriteria;
import java.util.List;

public interface OrderInfoDOMapper {
    int countByExample(OrderInfoDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfoDO record);

    int insertSelective(OrderInfoDO record);

    List<OrderInfoDO> selectByExample(OrderInfoDOCriteria example);

    OrderInfoDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfoDO record);

    int updateByPrimaryKey(OrderInfoDO record);
}