package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.TeamApplyDO;
import com.sun.istack.internal.NotNull;

public class TeamApplyForm {
         private Integer id;

         private Integer teamId;

         private Integer userId;

         private Integer status;

         private Integer isDeleted;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
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

    public TeamApplyDO toDO(){
TeamApplyDO teamApplyDO  = new TeamApplyDO();
                teamApplyDO.setTeamId(this.teamId);
                teamApplyDO.setUserId(this.userId);
                teamApplyDO.setStatus(this.status);
                teamApplyDO.setIsDeleted(this.isDeleted);
                teamApplyDO.setGmtModify(this.gmtModify);
                teamApplyDO.setGmtCreate(this.gmtCreate);
        return teamApplyDO;
    }

}
