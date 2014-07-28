package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.GoodsDO;
import com.sun.istack.internal.NotNull;

public class GoodsForm {
         private Integer id;

         private String goodsName;

         private String goodsDesc;

         private Long price;

         private Integer courtId;

         private Integer isDeleted;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public String getGoodsDesc() {
        return goodsDesc;
    }
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Integer getCourtId() {
        return courtId;
    }
    public void setCourtId(Integer courtId) {
        this.courtId = courtId;
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

    public GoodsDO toDO(){
GoodsDO goodsDO  = new GoodsDO();
                goodsDO.setGoodsName(this.goodsName);
                goodsDO.setGoodsDesc(this.goodsDesc);
                goodsDO.setPrice(this.price);
                goodsDO.setCourtId(this.courtId);
                goodsDO.setIsDeleted(this.isDeleted);
                goodsDO.setGmtModify(this.gmtModify);
                goodsDO.setGmtCreate(this.gmtCreate);
        return goodsDO;
    }

}
