package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.OrderInfoDO;


public class OrderInfoEditForm extends OrderInfoForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderInfoDO toDO(){
        OrderInfoDO orderInfoDO  =super.toDO();
        orderInfoDO.setId(this.id);
        return orderInfoDO;
    }

    public void initForm(OrderInfoDO orderInfoDO){
        if(orderInfoDO == null){
           return ;
        }
                this.setId(orderInfoDO.getId());
                this.setGoodsId(orderInfoDO.getGoodsId());
                this.setUserId(orderInfoDO.getUserId());
                this.setLeaveMsg(orderInfoDO.getLeaveMsg());
                this.setIsDeleted(orderInfoDO.getIsDeleted());
                this.setGmtModify(orderInfoDO.getGmtModify());
                this.setGmtCreate(orderInfoDO.getGmtCreate());
            }

}
