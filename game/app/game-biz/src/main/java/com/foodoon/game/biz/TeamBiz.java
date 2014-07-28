package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.TeamDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface TeamBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(TeamDO teamDO);

        BizResult update(TeamDO teamDO);

}
