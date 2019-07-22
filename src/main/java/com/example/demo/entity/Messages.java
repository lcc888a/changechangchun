package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 聊天记录表
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
public class Messages extends Model<Messages> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "M_ID", type = IdType.AUTO)
    private Integer M_ID;

    /**
     * 消息内容
     */
    private String M_PostMessages;

    /**
     * 接受的状态
     */
    private Boolean M_status;

    /**
     * 发送者id
     */
    private Integer M_FromUserID;

    /**
     * 接受着id
     */
    private Integer M_ToUserID;

    /**
     * 发送时间（当前时间）
     */
    private Date M_Time;

    public Integer getM_ID() {
        return M_ID;
    }

    public void setM_ID(Integer M_ID) {
        this.M_ID = M_ID;
    }
    public String getM_PostMessages() {
        return M_PostMessages;
    }

    public void setM_PostMessages(String M_PostMessages) {
        this.M_PostMessages = M_PostMessages;
    }
    public Boolean getM_status() {
        return M_status;
    }

    public void setM_status(Boolean M_status) {
        this.M_status = M_status;
    }
    public Integer getM_FromUserID() {
        return M_FromUserID;
    }

    public void setM_FromUserID(Integer M_FromUserID) {
        this.M_FromUserID = M_FromUserID;
    }
    public Integer getM_ToUserID() {
        return M_ToUserID;
    }

    public void setM_ToUserID(Integer M_ToUserID) {
        this.M_ToUserID = M_ToUserID;
    }
    public Date getM_Time() {
        return M_Time;
    }

    public void setM_Time(Date M_Time) {
        this.M_Time = M_Time;
    }

    @Override
    protected Serializable pkVal() {
        return this.M_ID;
    }

    @Override
    public String toString() {
        return "Messages{" +
        "M_ID=" + M_ID +
        ", M_PostMessages=" + M_PostMessages +
        ", M_status=" + M_status +
        ", M_FromUserID=" + M_FromUserID +
        ", M_ToUserID=" + M_ToUserID +
        ", M_Time=" + M_Time +
        "}";
    }
}
