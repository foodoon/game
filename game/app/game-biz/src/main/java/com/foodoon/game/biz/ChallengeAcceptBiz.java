package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.ChallengeAcceptDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface ChallengeAcceptBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(ChallengeAcceptDO challengeAcceptDO);

        BizResult update(ChallengeAcceptDO challengeAcceptDO);

}
