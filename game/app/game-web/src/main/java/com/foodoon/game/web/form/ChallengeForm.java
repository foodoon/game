package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.ChallengeDO;
import com.sun.istack.internal.NotNull;

public class ChallengeForm {
         private Integer id;

         private Integer userId;

         private Integer courtId;

         private Date challengeTime;

         private String challengeDesc;

         private String challengeResult;

         private Integer goalCount;

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
    public Date getChallengeTime() {
        return challengeTime;
    }
    public void setChallengeTime(Date challengeTime) {
        this.challengeTime = challengeTime;
    }
    public String getChallengeDesc() {
        return challengeDesc;
    }
    public void setChallengeDesc(String challengeDesc) {
        this.challengeDesc = challengeDesc;
    }
    public String getChallengeResult() {
        return challengeResult;
    }
    public void setChallengeResult(String challengeResult) {
        this.challengeResult = challengeResult;
    }
    public Integer getGoalCount() {
        return goalCount;
    }
    public void setGoalCount(Integer goalCount) {
        this.goalCount = goalCount;
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

    public ChallengeDO toDO(){
ChallengeDO challengeDO  = new ChallengeDO();
                challengeDO.setUserId(this.userId);
                challengeDO.setCourtId(this.courtId);
                challengeDO.setChallengeTime(this.challengeTime);
                challengeDO.setChallengeDesc(this.challengeDesc);
                challengeDO.setChallengeResult(this.challengeResult);
                challengeDO.setGoalCount(this.goalCount);
                challengeDO.setIsDeleted(this.isDeleted);
                challengeDO.setGmtModify(this.gmtModify);
                challengeDO.setGmtCreate(this.gmtCreate);
        return challengeDO;
    }

}
