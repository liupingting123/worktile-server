package com.worktile.service.impl;

import com.worktile.dao.User;
import com.worktile.mapper.UserMapper;
import com.worktile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 67594 on 2016/11/2.
 */
@Service("userService")
public class UserServiceImpl  implements UserService {
    private UserMapper userMapper;


    public void setItemsCustomMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public int getUserById(int id) {
        User user=new User();
        user.setNickname("cdccdcd");
        user.setPassword("dcdcdcd");
        user.setUsername("cdcdcd");
        return userMapper.insert(user);
    }

    public List<User> getUsers() {
        return null;
    }

    public int insert(User userInfo) {
        return 0;
    }


}
