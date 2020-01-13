package com.dmcq.miaosha.dao;

import com.dmcq.miaosha.dataobject.UserPasswordDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserPasswordDOMapper extends Mapper<UserPasswordDO> {
    void selectOne();
}