package com.dmz.study.metrics.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author dmz
 * @date Create in 22:06 2019/3/4
 */
@Data
@Builder
@ToString(callSuper = true)
public class User extends Parent{
    private String name;
    private String sex;
    private Integer age;
}
