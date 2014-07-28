package com.foodoon.game.web.form;

import com.foodoon.game.dao.domain.UserInfoDO;


public class UserInfoEditForm extends UserInfoForm{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserInfoDO toDO(){
        UserInfoDO userInfoDO  =super.toDO();
        userInfoDO.setId(this.id);
        return userInfoDO;
    }

    public void initForm(UserInfoDO userInfoDO){
        if(userInfoDO == null){
           return ;
        }
                this.setId(userInfoDO.getId());
                this.setUserName(userInfoDO.getUserName());
                this.setPassword(userInfoDO.getPassword());
                this.setPhone(userInfoDO.getPhone());
                this.setGroundTypeOfEnjoy(userInfoDO.getGroundTypeOfEnjoy());
                this.setSpecial(userInfoDO.getSpecial());
                this.setGroundOfDaily(userInfoDO.getGroundOfDaily());
                this.setStatus(userInfoDO.getStatus());
                this.setImg(userInfoDO.getImg());
                this.setGmtModify(userInfoDO.getGmtModify());
                this.setGmtCreate(userInfoDO.getGmtCreate());
            }

}
