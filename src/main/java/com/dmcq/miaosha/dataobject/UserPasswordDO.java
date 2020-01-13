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
@Table(name = "user_password")
public class UserPasswordDO {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 密码
     */
    @Column(name = "encript_password")
    private String encriptPassword;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;
}