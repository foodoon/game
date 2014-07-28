package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.CourtDO;


public class CourtEditForm extends CourtForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CourtDO toDO(){
        CourtDO courtDO  =super.toDO();
        courtDO.setId(this.id);
        return courtDO;
    }

    public void initForm(CourtDO courtDO){
        if(courtDO == null){
           return ;
        }
                this.setId(courtDO.getId());
                this.setName(courtDO.getName());
                this.setAddress(courtDO.getAddress());
                this.setType(courtDO.getType());
                this.setOpenTime(courtDO.getOpenTime());
                this.setSquare(courtDO.getSquare());
                this.setUserId(courtDO.getUserId());
                this.setIsDeleted(courtDO.getIsDeleted());
                this.setStatus(courtDO.getStatus());
                this.setDesc(courtDO.getDesc());
                this.setGmtModify(courtDO.getGmtModify());
                this.setGmtCreate(courtDO.getGmtCreate());
            }

}
