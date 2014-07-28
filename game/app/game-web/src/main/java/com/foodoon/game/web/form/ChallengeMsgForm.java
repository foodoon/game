package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.ChallengeMsgDO;
import com.sun.istack.internal.NotNull;

public class ChallengeMsgForm {
         private Integer id;

         private Integer challengeId;

         private String msg;

         private Integer isDeleted;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getChallengeId() {
        return challengeId;
    }
    public void setChallengeId(Integer challengeId) {
        this.challengeId = challengeId;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
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

    public ChallengeMsgDO toDO(){
ChallengeMsgDO challengeMsgDO  = new ChallengeMsgDO();
                challengeMsgDO.setChallengeId(this.challengeId);
                challengeMsgDO.setMsg(this.msg);
                challengeMsgDO.setIsDeleted(this.isDeleted);
                challengeMsgDO.setGmtModify(this.gmtModify);
                challengeMsgDO.setGmtCreate(this.gmtCreate);
        return challengeMsgDO;
    }

}
