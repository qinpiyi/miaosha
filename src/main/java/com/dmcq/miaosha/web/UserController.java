package com.dmcq.miaosha.web;/**
 * @description:
 * @author: qinhao25
 * @time: 2020/1/10 18:18
 */

import com.dmcq.miaosha.service.UserService;
import com.dmcq.miaosha.service.impl.UserServiceImpl;
import com.dmcq.miaosha.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@description:
 *@author: qinhao25
 *@time: 2020/1/10 18:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserModel findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
}
