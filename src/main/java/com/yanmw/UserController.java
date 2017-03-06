package com.yanmw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tedu on 2017/2/28.
 */
@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    @ResponseBody
    public String  findByName(){
    User user=userMapper.findUserByName("tom");
    return user.getAge()+","+user.getId()+","+user.getPassword();
    }
}
