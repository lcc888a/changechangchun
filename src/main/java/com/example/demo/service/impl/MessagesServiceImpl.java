package com.example.demo.service.impl;

import com.example.demo.entity.Messages;
import com.example.demo.mapper.MessagesMapper;
import com.example.demo.service.IMessagesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 聊天记录表 服务实现类
 * </p>
 *
 * @author lichangchun
 * @since 2019-07-17
 */
@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages> implements IMessagesService {

}
