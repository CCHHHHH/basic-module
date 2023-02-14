package com.demo.chenhao.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * @author chenhao
 * @date 2023/2/14 09:50
 **/
public class UserDemo extends Model<UserDemo> {
    private String id;
    private String userName;
    private String password;
    private String address;
    private Integer sex;
    private String idCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
