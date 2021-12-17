package com.chris.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chris.webadmin.bean.User;
import com.chris.webadmin.mapper.UserMapper;
import com.chris.webadmin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ author: chris
 * @ creat: 2021-12-14 23:55
 * @ description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
