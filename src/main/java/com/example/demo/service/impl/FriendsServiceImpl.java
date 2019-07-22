package com.example.demo.service.impl;

import com.example.demo.entity.Friends;
import com.example.demo.mapper.FriendsMapper;
import com.example.demo.service.IFriendsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 好友表 服务实现类
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
@Service
public class FriendsServiceImpl extends ServiceImpl<FriendsMapper, Friends> implements IFriendsService {

}
