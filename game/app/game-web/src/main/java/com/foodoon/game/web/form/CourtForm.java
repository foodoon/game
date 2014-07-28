package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.CourtDO;
import com.sun.istack.internal.NotNull;

public class CourtForm {
         private Integer id;

         private String name;

         private String address;

         private String type;

         private String openTime;

         private String square;

         private Integer userId;

         private Integer isDeleted;

         private Integer status;

         private String desc;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getOpenTime() {
        return openTime;
    }
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
    public String getSquare() {
        return square;
    }
    public void setSquare(String square) {
        this.square = square;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
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

    public CourtDO toDO(){
CourtDO courtDO  = new CourtDO();
                courtDO.setName(this.name);
                courtDO.setAddress(this.address);
                courtDO.setType(this.type);
                courtDO.setOpenTime(this.openTime);
                courtDO.setSquare(this.square);
                courtDO.setUserId(this.userId);
                courtDO.setIsDeleted(this.isDeleted);
                courtDO.setStatus(this.status);
                courtDO.setDesc(this.desc);
                courtDO.setGmtModify(this.gmtModify);
                courtDO.setGmtCreate(this.gmtCreate);
        return courtDO;
    }

}
