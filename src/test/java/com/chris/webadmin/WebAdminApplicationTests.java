package com.chris.webadmin;

import com.chris.webadmin.bean.User;
import com.chris.webadmin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class WebAdminApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }
    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息：{}", user);

    }

}
