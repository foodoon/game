package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.TeamRecruitDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface TeamRecruitBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(TeamRecruitDO teamRecruitDO);

        BizResult update(TeamRecruitDO teamRecruitDO);

}
