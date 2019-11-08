package com.itmuch.cloud.study.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by 86135 on 2019/10/12.
 */
@Getter
@Setter

public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

}
