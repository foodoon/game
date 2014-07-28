package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.CourtApplyDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface CourtApplyBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(CourtApplyDO courtApplyDO);

        BizResult update(CourtApplyDO courtApplyDO);

}
