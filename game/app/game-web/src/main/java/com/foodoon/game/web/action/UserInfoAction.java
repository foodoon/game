package com.foodoon.game.web.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.foodoon.game.biz.UserInfoBiz;
import com.foodoon.game.dao.domain.UserInfoDO;
import com.foodoon.game.web.form.UserInfoEditForm;
import com.foodoon.game.web.form.UserInfoForm;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;
import com.foodoon.tools.web.util.RequestUtil;


@Controller
public class UserInfoAction {


    @Autowired
    private UserInfoBiz userInfoBiz;

    @RequestMapping(value = "userInfo/list.htm", method = RequestMethod.GET)
    public String list(HttpServletRequest request, ModelMap modelMap) {
        int pageId = RequestUtil.getInt(request, "pageNo");
        int pageSize = RequestUtil.getInt(request, "pageSize");
        BaseQuery baseQuery = new BaseQuery();
        baseQuery.setPageNo(pageId);
        baseQuery.setPageSize(pageSize);
        BizResult bizResult = userInfoBiz.list(baseQuery);
        if (bizResult.success) {
            modelMap.putAll(bizResult.data);
            return "userInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "userInfo/edit.htm", method = RequestMethod.GET)
    public String edit(HttpServletRequest request, ModelMap modelMap, UserInfoEditForm userInfoEditForm,
        BindingResult result, Map<String,Object> model) {
        int id = RequestUtil.getInt(request, "id");
        BizResult bizResult = userInfoBiz.detail(id);
        if (bizResult.success) {
            modelMap.putAll(bizResult.data);
            userInfoEditForm.initForm(((UserInfoDO)bizResult.data.get("userInfoDO")));
            return "userInfo/edit.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "userInfo/detail.htm", method = RequestMethod.GET)
    public String detail(HttpServletRequest request, ModelMap modelMap) {
        int id = RequestUtil.getInt(request, "id");
        BizResult bizResult = userInfoBiz.detail(id);
        if (bizResult.success) {
            modelMap.putAll(bizResult.data);
            return "userInfo/detail.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "userInfo/create.htm", method = RequestMethod.GET)
    public String create(HttpServletRequest request, ModelMap modelMap, UserInfoForm userInfoForm,
        BindingResult result, Map<String,Object> model) {
        return "userInfo/create.vm";
    }

    @RequestMapping(value = "userInfo/doCreate.htm", method = RequestMethod.POST)
    public String doCreate(HttpServletRequest request, ModelMap modelMap,@Valid UserInfoForm userInfoForm,
        BindingResult result, Map<String,Object> model) {
        if (result.hasErrors()) {
            return "userInfo/create.vm";
        }
        UserInfoDO userInfoDO = userInfoForm.toDO();
        BizResult bizResult = userInfoBiz.create(userInfoDO);
        if (bizResult.success) {
            return "redirect:/userInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "userInfo/doUpdate.htm", method = RequestMethod.POST)
    public String doUpdate(HttpServletRequest request, HttpServletResponse response,ModelMap modelMap,@Valid UserInfoEditForm userInfoEditForm,
        BindingResult result, Map<String,Object> model) {
        if (result.hasErrors()) {
            return "userInfo/edit.vm";
        }
        UserInfoDO userInfoDO = userInfoEditForm.toDO();
        BizResult bizResult = userInfoBiz.update(userInfoDO);
        if (bizResult.success) {
            return "redirect:/userInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "userInfo/doDelete.htm", method = RequestMethod.POST)
    public String doDelete(HttpServletRequest request, ModelMap modelMap) {
        int id = RequestUtil.getInt(request, "id");
        BizResult bizResult = userInfoBiz.delete(id);
        if (bizResult.success) {
            return "userInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }



}
