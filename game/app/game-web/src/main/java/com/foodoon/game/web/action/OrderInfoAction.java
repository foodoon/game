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

import com.foodoon.game.biz.OrderInfoBiz;
import com.foodoon.game.dao.domain.OrderInfoDO;
import com.foodoon.game.web.form.OrderInfoEditForm;
import com.foodoon.game.web.form.OrderInfoForm;
import com.foodoon.tools.web.page.BaseQuery;
import com.foodoon.tools.web.page.BizResult;
import com.foodoon.tools.web.util.RequestUtil;


@Controller
public class OrderInfoAction {


    @Autowired
    private OrderInfoBiz orderInfoBiz;

    @RequestMapping(value = "orderInfo/list.htm", method = RequestMethod.GET)
    public String list(HttpServletRequest request, ModelMap modelMap) {
        int pageId = RequestUtil.getInt(request, "pageNo");
        int pageSize = RequestUtil.getInt(request, "pageSize");
        BaseQuery baseQuery = new BaseQuery();
        baseQuery.setPageNo(pageId);
        baseQuery.setPageSize(pageSize);
        BizResult bizResult = orderInfoBiz.list(baseQuery);
        if (bizResult.success) {
            modelMap.putAll(bizResult.data);
            return "orderInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "orderInfo/edit.htm", method = RequestMethod.GET)
    public String edit(HttpServletRequest request, ModelMap modelMap, OrderInfoEditForm orderInfoEditForm,
        BindingResult result, Map<String,Object> model) {
        int id = RequestUtil.getInt(request, "id");
        BizResult bizResult = orderInfoBiz.detail(id);
        if (bizResult.success) {
            modelMap.putAll(bizResult.data);
            orderInfoEditForm.initForm(((OrderInfoDO)bizResult.data.get("orderInfoDO")));
            return "orderInfo/edit.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "orderInfo/detail.htm", method = RequestMethod.GET)
    public String detail(HttpServletRequest request, ModelMap modelMap) {
        int id = RequestUtil.getInt(request, "id");
        BizResult bizResult = orderInfoBiz.detail(id);
        if (bizResult.success) {
            modelMap.putAll(bizResult.data);
            return "orderInfo/detail.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "orderInfo/create.htm", method = RequestMethod.GET)
    public String create(HttpServletRequest request, ModelMap modelMap, OrderInfoForm orderInfoForm,
        BindingResult result, Map<String,Object> model) {
        return "orderInfo/create.vm";
    }

    @RequestMapping(value = "orderInfo/doCreate.htm", method = RequestMethod.POST)
    public String doCreate(HttpServletRequest request, ModelMap modelMap,@Valid OrderInfoForm orderInfoForm,
        BindingResult result, Map<String,Object> model) {
        if (result.hasErrors()) {
            return "orderInfo/create.vm";
        }
        OrderInfoDO orderInfoDO = orderInfoForm.toDO();
        BizResult bizResult = orderInfoBiz.create(orderInfoDO);
        if (bizResult.success) {
            return "redirect:/orderInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "orderInfo/doUpdate.htm", method = RequestMethod.POST)
    public String doUpdate(HttpServletRequest request, HttpServletResponse response,ModelMap modelMap,@Valid OrderInfoEditForm orderInfoEditForm,
        BindingResult result, Map<String,Object> model) {
        if (result.hasErrors()) {
            return "orderInfo/edit.vm";
        }
        OrderInfoDO orderInfoDO = orderInfoEditForm.toDO();
        BizResult bizResult = orderInfoBiz.update(orderInfoDO);
        if (bizResult.success) {
            return "redirect:/orderInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }

    @RequestMapping(value = "orderInfo/doDelete.htm", method = RequestMethod.POST)
    public String doDelete(HttpServletRequest request, ModelMap modelMap) {
        int id = RequestUtil.getInt(request, "id");
        BizResult bizResult = orderInfoBiz.delete(id);
        if (bizResult.success) {
            return "orderInfo/list.vm";
        } else {
            return "common/error.vm";
        }

    }



}
