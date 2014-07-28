package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.CourtDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface CourtBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(CourtDO courtDO);

        BizResult update(CourtDO courtDO);

}
