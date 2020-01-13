package com.dmcq.miaosha.service.model;/**
 * @description:
 * @author: qinhao25
 * @time: 2020/1/10 17:16
 */

import com.dmcq.miaosha.dataobject.UserDO;
import com.dmcq.miaosha.dataobject.UserPasswordDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;


/**
 *@description: 用户模型
 *@author: qinhao25
 *@time: 2020/1/10 17:16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 1-男，2-女
     */
    private Byte gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * wechat,alipay,phone
     */
    private String registerMode;

    /**
     * 第三方账户ID
     */
    private String thirdPartyId;

    /**
     * 密码
     */
    private String encriptPassword;

    public UserModel(UserDO userDO, UserPasswordDO userPasswordDO) {
        if(userDO != null){
            BeanUtils.copyProperties(userDO,this);
            if(userPasswordDO != null){
                this.encriptPassword = userPasswordDO.getEncriptPassword();
            }
        }

    }
}
