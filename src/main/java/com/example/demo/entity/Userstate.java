package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户状态表
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
public class Userstate extends Model<Userstate> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "US_ID", type = IdType.AUTO)
    private Integer US_ID;

    /**
     * 状态名
     */
    private String US_Name;

    public Integer getUS_ID() {
        return US_ID;
    }

    public void setUS_ID(Integer US_ID) {
        this.US_ID = US_ID;
    }
    public String getUS_Name() {
        return US_Name;
    }

    public void setUS_Name(String US_Name) {
        this.US_Name = US_Name;
    }

    @Override
    protected Serializable pkVal() {
        return this.US_ID;
    }

    @Override
    public String toString() {
        return "Userstate{" +
        "US_ID=" + US_ID +
        ", US_Name=" + US_Name +
        "}";
    }
}
