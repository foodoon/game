package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.CourtApplyDO;
import com.sun.istack.internal.NotNull;

public class CourtApplyForm {
         private Integer id;

         private Integer userId;

         private Integer courtId;

         private Date bookingTime;

         private Integer isDeleted;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getCourtId() {
        return courtId;
    }
    public void setCourtId(Integer courtId) {
        this.courtId = courtId;
    }
    public Date getBookingTime() {
        return bookingTime;
    }
    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
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

    public CourtApplyDO toDO(){
CourtApplyDO courtApplyDO  = new CourtApplyDO();
                courtApplyDO.setUserId(this.userId);
                courtApplyDO.setCourtId(this.courtId);
                courtApplyDO.setBookingTime(this.bookingTime);
                courtApplyDO.setIsDeleted(this.isDeleted);
                courtApplyDO.setGmtModify(this.gmtModify);
                courtApplyDO.setGmtCreate(this.gmtCreate);
        return courtApplyDO;
    }

}
