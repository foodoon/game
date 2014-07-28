package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.OrderInfoDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface OrderInfoBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(OrderInfoDO orderInfoDO);

        BizResult update(OrderInfoDO orderInfoDO);

}
