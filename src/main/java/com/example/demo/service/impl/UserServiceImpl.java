package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
	@Resource
	private UserMapper userMapperx;

	@Override
	public User selectUser(HttpServletRequest request, HttpServletResponse response) {
		try{
        	String name=request.getParameter("U_LoginID");
        	String password=request.getParameter("U_Password");
        	
        	
        	User user=userMapperx.selectUser(name, password);
            if(user!=null) {
            	return user;
            }else {
            	return null;
            }
         
            
        }
        catch (Exception e){
          e.printStackTrace();
            return null;
        }
		
	}

}
