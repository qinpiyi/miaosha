package com.dmcq.miaosha.dao.user;

import com.dmcq.miaosha.dataobject.UserDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserDOMapper extends Mapper<UserDO> {
}