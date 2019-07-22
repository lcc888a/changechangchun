package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 好友表
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
public class Friends extends Model<Friends> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "F_ID", type = IdType.AUTO)
    private Integer F_ID;

    /**
     * 好友id
     */
    private Integer F_FirendID;

    /**
     * 自己id
     */
    private Integer F_UserID;

    /**
     * 好友分组id
     */
    private Integer F_FriendGroupsID;

    /**
     * 好友备注
     */
    private String F_Name;

    public Integer getF_ID() {
        return F_ID;
    }

    public void setF_ID(Integer F_ID) {
        this.F_ID = F_ID;
    }
    public Integer getF_FirendID() {
        return F_FirendID;
    }

    public void setF_FirendID(Integer F_FirendID) {
        this.F_FirendID = F_FirendID;
    }
    public Integer getF_UserID() {
        return F_UserID;
    }

    public void setF_UserID(Integer F_UserID) {
        this.F_UserID = F_UserID;
    }
    public Integer getF_FriendGroupsID() {
        return F_FriendGroupsID;
    }

    public void setF_FriendGroupsID(Integer F_FriendGroupsID) {
        this.F_FriendGroupsID = F_FriendGroupsID;
    }
    public String getF_Name() {
        return F_Name;
    }

    public void setF_Name(String F_Name) {
        this.F_Name = F_Name;
    }

    @Override
    protected Serializable pkVal() {
        return this.F_ID;
    }

    @Override
    public String toString() {
        return "Friends{" +
        "F_ID=" + F_ID +
        ", F_FirendID=" + F_FirendID +
        ", F_UserID=" + F_UserID +
        ", F_FriendGroupsID=" + F_FriendGroupsID +
        ", F_Name=" + F_Name +
        "}";
    }
}
