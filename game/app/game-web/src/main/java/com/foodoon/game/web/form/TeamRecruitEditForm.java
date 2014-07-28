package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.TeamRecruitDO;


public class TeamRecruitEditForm extends TeamRecruitForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TeamRecruitDO toDO(){
        TeamRecruitDO teamRecruitDO  =super.toDO();
        teamRecruitDO.setId(this.id);
        return teamRecruitDO;
    }

    public void initForm(TeamRecruitDO teamRecruitDO){
        if(teamRecruitDO == null){
           return ;
        }
                this.setId(teamRecruitDO.getId());
                this.setUserId(teamRecruitDO.getUserId());
                this.setDesc(teamRecruitDO.getDesc());
                this.setIsDeleted(teamRecruitDO.getIsDeleted());
                this.setGmtModify(teamRecruitDO.getGmtModify());
                this.setGmtCreate(teamRecruitDO.getGmtCreate());
            }

}
