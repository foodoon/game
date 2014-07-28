package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.ChallengeDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface ChallengeBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(ChallengeDO challengeDO);

        BizResult update(ChallengeDO challengeDO);

}
