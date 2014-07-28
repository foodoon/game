package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.TeamDO;
import com.sun.istack.internal.NotNull;

public class TeamForm {
         private Integer id;

         private String name;

         private String desc;

         private Integer canJoin;

         private Integer isDeleted;

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
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Integer getCanJoin() {
        return canJoin;
    }
    public void setCanJoin(Integer canJoin) {
        this.canJoin = canJoin;
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

    public TeamDO toDO(){
TeamDO teamDO  = new TeamDO();
                teamDO.setName(this.name);
                teamDO.setDesc(this.desc);
                teamDO.setCanJoin(this.canJoin);
                teamDO.setIsDeleted(this.isDeleted);
                teamDO.setGmtModify(this.gmtModify);
                teamDO.setGmtCreate(this.gmtCreate);
        return teamDO;
    }

}
