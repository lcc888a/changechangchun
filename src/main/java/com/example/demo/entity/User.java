package com.example.demo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer U_ID;

    /**
     * 登录账号
     */
    private String U_LoginID;

    /**
     * 昵称
     */
    private String U_NickName;

    /**
     * 个性签名
     */
    private String U_SignTure;

    /**
     * 性别
     */
    private Boolean U_Sex;

    /**
     * 电话
     */
    private String U_Telephone;

    /**
     * 真实姓名
     */
    private String U_Name;

    /**
     * 邮箱
     */
    private String U_Email;

    /**
     * 头像
     */
    private String U_HeadPortrait;

    /**
     * 年龄
     */
    private Integer U_Age;

    /**
     * 创建时间
     */
    private Date U_CreateTime;

    /**
     * 修改时间
     */
    private Date U_UpdateTime;

    /**
     * 密码
     */
    private String U_Password;

    public Integer getU_ID() {
        return U_ID;
    }

    public void setU_ID(Integer U_ID) {
        this.U_ID = U_ID;
    }
    public String getU_LoginID() {
        return U_LoginID;
    }

    public void setU_LoginID(String U_LoginID) {
        this.U_LoginID = U_LoginID;
    }
    public String getU_NickName() {
        return U_NickName;
    }

    public void setU_NickName(String U_NickName) {
        this.U_NickName = U_NickName;
    }
    public String getU_SignTure() {
        return U_SignTure;
    }

    public void setU_SignTure(String U_SignTure) {
        this.U_SignTure = U_SignTure;
    }
    public Boolean getU_Sex() {
        return U_Sex;
    }

    public void setU_Sex(Boolean U_Sex) {
        this.U_Sex = U_Sex;
    }
    public String getU_Telephone() {
        return U_Telephone;
    }

    public void setU_Telephone(String U_Telephone) {
        this.U_Telephone = U_Telephone;
    }
    public String getU_Name() {
        return U_Name;
    }

    public void setU_Name(String U_Name) {
        this.U_Name = U_Name;
    }
    public String getU_Email() {
        return U_Email;
    }

    public void setU_Email(String U_Email) {
        this.U_Email = U_Email;
    }
    public String getU_HeadPortrait() {
        return U_HeadPortrait;
    }

    public void setU_HeadPortrait(String U_HeadPortrait) {
        this.U_HeadPortrait = U_HeadPortrait;
    }
    public Integer getU_Age() {
        return U_Age;
    }

    public void setU_Age(Integer U_Age) {
        this.U_Age = U_Age;
    }
    public Date getU_CreateTime() {
        return U_CreateTime;
    }

    public void setU_CreateTime(Date U_CreateTime) {
        this.U_CreateTime = U_CreateTime;
    }
    public Date getU_UpdateTime() {
        return U_UpdateTime;
    }

    public void setU_UpdateTime(Date U_UpdateTime) {
        this.U_UpdateTime = U_UpdateTime;
    }
    public String getU_Password() {
        return U_Password;
    }

    public void setU_Password(String U_Password) {
        this.U_Password = U_Password;
    }

    @Override
    protected Serializable pkVal() {
        return this.U_ID;
    }

    @Override
    public String toString() {
        return "User{" +
        "U_ID=" + U_ID +
        ", U_LoginID=" + U_LoginID +
        ", U_NickName=" + U_NickName +
        ", U_SignTure=" + U_SignTure +
        ", U_Sex=" + U_Sex +
        ", U_Telephone=" + U_Telephone +
        ", U_Name=" + U_Name +
        ", U_Email=" + U_Email +
        ", U_HeadPortrait=" + U_HeadPortrait +
        ", U_Age=" + U_Age +
        ", U_CreateTime=" + U_CreateTime +
        ", U_UpdateTime=" + U_UpdateTime +
        ", U_Password=" + U_Password +
        "}";
    }
}
