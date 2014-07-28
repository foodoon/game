package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.ChallengeAcceptDO;
import com.sun.istack.internal.NotNull;

public class ChallengeAcceptForm {
         private Integer id;

         private Integer challengeId;

         private Integer teamId;

         private Integer goalCount;

         private String challengeResult;

         private Integer accept;

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
    public Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
    public Integer getGoalCount() {
        return goalCount;
    }
    public void setGoalCount(Integer goalCount) {
        this.goalCount = goalCount;
    }
    public String getChallengeResult() {
        return challengeResult;
    }
    public void setChallengeResult(String challengeResult) {
        this.challengeResult = challengeResult;
    }
    public Integer getAccept() {
        return accept;
    }
    public void setAccept(Integer accept) {
        this.accept = accept;
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

    public ChallengeAcceptDO toDO(){
ChallengeAcceptDO challengeAcceptDO  = new ChallengeAcceptDO();
                challengeAcceptDO.setChallengeId(this.challengeId);
                challengeAcceptDO.setTeamId(this.teamId);
                challengeAcceptDO.setGoalCount(this.goalCount);
                challengeAcceptDO.setChallengeResult(this.challengeResult);
                challengeAcceptDO.setAccept(this.accept);
                challengeAcceptDO.setIsDeleted(this.isDeleted);
                challengeAcceptDO.setGmtModify(this.gmtModify);
                challengeAcceptDO.setGmtCreate(this.gmtCreate);
        return challengeAcceptDO;
    }

}
