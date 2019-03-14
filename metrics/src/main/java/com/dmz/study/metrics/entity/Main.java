package com.dmz.study.metrics.entity;

/**
 * @author dmz
 * @date Create in 16:08 2019/3/11
 */
public class Main {
    public static void main(String[] args) {
        User user = User.builder().age(1).name("在jam沙漠").sex("男").build();
        user.setHealth("true");
        System.out.println(user.toString());
    }
}
