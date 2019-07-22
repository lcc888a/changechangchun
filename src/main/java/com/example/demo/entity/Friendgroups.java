package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 好友分组表
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
public class Friendgroups extends Model<Friendgroups> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "FG_ID", type = IdType.AUTO)
    private Integer FG_ID;

    /**
     * 分组名字
     */
    private String FG_Name;

    /**
     * 用户id
     */
    private Integer FG_UserID;

    public Integer getFG_ID() {
        return FG_ID;
    }

    public void setFG_ID(Integer FG_ID) {
        this.FG_ID = FG_ID;
    }
    public String getFG_Name() {
        return FG_Name;
    }

    public void setFG_Name(String FG_Name) {
        this.FG_Name = FG_Name;
    }
    public Integer getFG_UserID() {
        return FG_UserID;
    }

    public void setFG_UserID(Integer FG_UserID) {
        this.FG_UserID = FG_UserID;
    }

    @Override
    protected Serializable pkVal() {
        return this.FG_ID;
    }

    @Override
    public String toString() {
        return "Friendgroups{" +
        "FG_ID=" + FG_ID +
        ", FG_Name=" + FG_Name +
        ", FG_UserID=" + FG_UserID +
        "}";
    }
}
