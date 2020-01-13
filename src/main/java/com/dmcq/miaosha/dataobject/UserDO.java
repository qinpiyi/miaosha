package com.dmcq.miaosha.dataobject;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_info")
public class UserDO {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
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
    @Column(name = "register_mode")
    private String registerMode;

    /**
     * 第三方账户ID
     */
    @Column(name = "third_party_id")
    private String thirdPartyId;
}