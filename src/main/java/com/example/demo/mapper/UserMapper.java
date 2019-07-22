package com.example.demo.mapper;

import com.example.demo.entity.User;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
public interface UserMapper extends BaseMapper<User> {
	
	
	public User selectUser(@Param("U_LoginID") String U_LoginID,@Param("U_Password") String U_Password);

}
