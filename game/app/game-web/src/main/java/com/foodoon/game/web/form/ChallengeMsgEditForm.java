package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.ChallengeMsgDO;


public class ChallengeMsgEditForm extends ChallengeMsgForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ChallengeMsgDO toDO(){
        ChallengeMsgDO challengeMsgDO  =super.toDO();
        challengeMsgDO.setId(this.id);
        return challengeMsgDO;
    }

    public void initForm(ChallengeMsgDO challengeMsgDO){
        if(challengeMsgDO == null){
           return ;
        }
                this.setId(challengeMsgDO.getId());
                this.setChallengeId(challengeMsgDO.getChallengeId());
                this.setMsg(challengeMsgDO.getMsg());
                this.setIsDeleted(challengeMsgDO.getIsDeleted());
                this.setGmtModify(challengeMsgDO.getGmtModify());
                this.setGmtCreate(challengeMsgDO.getGmtCreate());
            }

}
