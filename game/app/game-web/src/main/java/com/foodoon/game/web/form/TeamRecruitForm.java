package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.TeamRecruitDO;
import com.sun.istack.internal.NotNull;

public class TeamRecruitForm {
         private Integer id;

         private Integer userId;

         private String desc;

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
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
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

    public TeamRecruitDO toDO(){
TeamRecruitDO teamRecruitDO  = new TeamRecruitDO();
                teamRecruitDO.setUserId(this.userId);
                teamRecruitDO.setDesc(this.desc);
                teamRecruitDO.setIsDeleted(this.isDeleted);
                teamRecruitDO.setGmtModify(this.gmtModify);
                teamRecruitDO.setGmtCreate(this.gmtCreate);
        return teamRecruitDO;
    }

}
