package com.dmcq.miaosha.service.impl;/**
 * @description:
 * @author: qinhao25
 * @time: 2020/1/10 17:28
 */

import com.dmcq.miaosha.dao.UserDOMapper;
import com.dmcq.miaosha.dao.UserPasswordDOMapper;
import com.dmcq.miaosha.dataobject.UserDO;
import com.dmcq.miaosha.dataobject.UserPasswordDO;
import com.dmcq.miaosha.service.UserService;
import com.dmcq.miaosha.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@description:
 *@author: qinhao25
 *@time: 2020/1/10 17:28
 */
@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    //private UserDOMapper userDOMapper;
    //
    //@Autowired
    //private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel get(Long id) {
        //UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        //if(userDO == null){
        //    return null;
        //}
        //UserPasswordDO userPasswordDO = userPasswordDOMapper.selectOne(UserPasswordDO.builder().userId(id).build());
        return new UserModel();
    }

}
