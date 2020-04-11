package com.example.mybatis.mapper;

import com.example.mybatis.enums.UserSexEnum;
import com.example.mybatis.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void saveUserTest() {
        userMapper.insert(new User("haoyi","3211456", UserSexEnum.MAN));
        Assert.assertEquals(4,userMapper.getUserAll().size());
    }

    @Test
    public void updateUserTest() {
        User user = new User();
        user.setId(40L);
        user.setUserName("haoyi");
        user.setPassWord("123456789");
        user.setUserSex(UserSexEnum.WOMAN);
        user.setNickName("ffff");

        userMapper.update(user);
    }

    @Test
    public void deleteUserTest() {
        userMapper.delete(40L);
    }
}
