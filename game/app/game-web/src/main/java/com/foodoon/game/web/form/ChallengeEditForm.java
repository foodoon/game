package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.ChallengeDO;


public class ChallengeEditForm extends ChallengeForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ChallengeDO toDO(){
        ChallengeDO challengeDO  =super.toDO();
        challengeDO.setId(this.id);
        return challengeDO;
    }

    public void initForm(ChallengeDO challengeDO){
        if(challengeDO == null){
           return ;
        }
                this.setId(challengeDO.getId());
                this.setUserId(challengeDO.getUserId());
                this.setCourtId(challengeDO.getCourtId());
                this.setChallengeTime(challengeDO.getChallengeTime());
                this.setChallengeDesc(challengeDO.getChallengeDesc());
                this.setChallengeResult(challengeDO.getChallengeResult());
                this.setGoalCount(challengeDO.getGoalCount());
                this.setIsDeleted(challengeDO.getIsDeleted());
                this.setGmtModify(challengeDO.getGmtModify());
                this.setGmtCreate(challengeDO.getGmtCreate());
            }

}
