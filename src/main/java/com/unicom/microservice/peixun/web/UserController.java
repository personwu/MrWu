package com.unicom.microservice.peixun.web;


import com.unicom.microservice.peixun.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("com/mrwu")
@Api(value = "com/mrwu")
public class UserController {


    @RequestMapping(value = "users",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有用户")
    public List<User> users(){
        List<User> users=new ArrayList<>();
        User user1 = new User();
        user1.setName("你好");
        User user2 = new User();
        user1.setAge(19);
        user2.setName("liu");
        user2.setAge(15);
        users.add(user1);
        users.add(user2);
        return users;

    }
}
