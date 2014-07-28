package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.TeamApplyDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface TeamApplyBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(TeamApplyDO teamApplyDO);

        BizResult update(TeamApplyDO teamApplyDO);

}
