package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.TeamApplyDO;


public class TeamApplyEditForm extends TeamApplyForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TeamApplyDO toDO(){
        TeamApplyDO teamApplyDO  =super.toDO();
        teamApplyDO.setId(this.id);
        return teamApplyDO;
    }

    public void initForm(TeamApplyDO teamApplyDO){
        if(teamApplyDO == null){
           return ;
        }
                this.setId(teamApplyDO.getId());
                this.setTeamId(teamApplyDO.getTeamId());
                this.setUserId(teamApplyDO.getUserId());
                this.setStatus(teamApplyDO.getStatus());
                this.setIsDeleted(teamApplyDO.getIsDeleted());
                this.setGmtModify(teamApplyDO.getGmtModify());
                this.setGmtCreate(teamApplyDO.getGmtCreate());
            }

}
