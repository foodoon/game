package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.GoodsDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface GoodsBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(GoodsDO goodsDO);

        BizResult update(GoodsDO goodsDO);

}
