package com.foodoon.game.biz;

import com.foodoon.game.dao.domain.UserInfoDO;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;

public interface UserInfoBiz {

        BizResult detail(int id);

        BizResult list(BaseQuery baseQuery);

        BizResult delete(int id);

        BizResult create(UserInfoDO userInfoDO);

        BizResult update(UserInfoDO userInfoDO);

}
