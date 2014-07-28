package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.GoodsDO;


public class GoodsEditForm extends GoodsForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GoodsDO toDO(){
        GoodsDO goodsDO  =super.toDO();
        goodsDO.setId(this.id);
        return goodsDO;
    }

    public void initForm(GoodsDO goodsDO){
        if(goodsDO == null){
           return ;
        }
                this.setId(goodsDO.getId());
                this.setGoodsName(goodsDO.getGoodsName());
                this.setGoodsDesc(goodsDO.getGoodsDesc());
                this.setPrice(goodsDO.getPrice());
                this.setCourtId(goodsDO.getCourtId());
                this.setIsDeleted(goodsDO.getIsDeleted());
                this.setGmtModify(goodsDO.getGmtModify());
                this.setGmtCreate(goodsDO.getGmtCreate());
            }

}
