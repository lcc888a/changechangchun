package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */

public interface IUserService extends IService<User> {
	
	public User selectUser( HttpServletRequest request, HttpServletResponse response); 

}
