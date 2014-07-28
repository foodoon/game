package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.OrderInfoDO;
import com.sun.istack.internal.NotNull;

public class OrderInfoForm {
         private Integer id;

         private Integer goodsId;

         private Integer userId;

         private String leaveMsg;

         private Integer isDeleted;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getLeaveMsg() {
        return leaveMsg;
    }
    public void setLeaveMsg(String leaveMsg) {
        this.leaveMsg = leaveMsg;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Date getGmtModify() {
        return gmtModify;
    }
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
    public Date getGmtCreate() {
        return gmtCreate;
    }
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public OrderInfoDO toDO(){
OrderInfoDO orderInfoDO  = new OrderInfoDO();
                orderInfoDO.setGoodsId(this.goodsId);
                orderInfoDO.setUserId(this.userId);
                orderInfoDO.setLeaveMsg(this.leaveMsg);
                orderInfoDO.setIsDeleted(this.isDeleted);
                orderInfoDO.setGmtModify(this.gmtModify);
                orderInfoDO.setGmtCreate(this.gmtCreate);
        return orderInfoDO;
    }

}
