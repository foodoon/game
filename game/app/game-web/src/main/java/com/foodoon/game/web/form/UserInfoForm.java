package com.foodoon.game.web.form;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.foodoon.game.dao.domain.UserInfoDO;
import com.sun.istack.internal.NotNull;

public class UserInfoForm {
         private Integer id;

         private String userName;

         private String password;

         private String phone;

         private String groundTypeOfEnjoy;

         private String special;

         private String groundOfDaily;

         private Integer status;

         private String img;

         private Date gmtModify;

         private Date gmtCreate;

       public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGroundTypeOfEnjoy() {
        return groundTypeOfEnjoy;
    }
    public void setGroundTypeOfEnjoy(String groundTypeOfEnjoy) {
        this.groundTypeOfEnjoy = groundTypeOfEnjoy;
    }
    public String getSpecial() {
        return special;
    }
    public void setSpecial(String special) {
        this.special = special;
    }
    public String getGroundOfDaily() {
        return groundOfDaily;
    }
    public void setGroundOfDaily(String groundOfDaily) {
        this.groundOfDaily = groundOfDaily;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
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

    public UserInfoDO toDO(){
UserInfoDO userInfoDO  = new UserInfoDO();
                userInfoDO.setUserName(this.userName);
                userInfoDO.setPassword(this.password);
                userInfoDO.setPhone(this.phone);
                userInfoDO.setGroundTypeOfEnjoy(this.groundTypeOfEnjoy);
                userInfoDO.setSpecial(this.special);
                userInfoDO.setGroundOfDaily(this.groundOfDaily);
                userInfoDO.setStatus(this.status);
                userInfoDO.setImg(this.img);
                userInfoDO.setGmtModify(this.gmtModify);
                userInfoDO.setGmtCreate(this.gmtCreate);
        return userInfoDO;
    }

}
