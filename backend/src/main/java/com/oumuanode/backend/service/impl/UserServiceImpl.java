package com.oumuanode.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oumuanode.backend.mapper.UserMapper;
import com.oumuanode.backend.pojo.User;
import com.oumuanode.backend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
