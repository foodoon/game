package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.TeamDO;


public class TeamEditForm extends TeamForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TeamDO toDO(){
        TeamDO teamDO  =super.toDO();
        teamDO.setId(this.id);
        return teamDO;
    }

    public void initForm(TeamDO teamDO){
        if(teamDO == null){
           return ;
        }
                this.setId(teamDO.getId());
                this.setName(teamDO.getName());
                this.setDesc(teamDO.getDesc());
                this.setCanJoin(teamDO.getCanJoin());
                this.setIsDeleted(teamDO.getIsDeleted());
                this.setGmtModify(teamDO.getGmtModify());
                this.setGmtCreate(teamDO.getGmtCreate());
            }

}
