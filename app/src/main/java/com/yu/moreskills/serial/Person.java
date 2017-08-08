package com.yu.moreskills.serial;

import java.io.Serializable;

/**
 * Created by D22436 on 2017/8/8.
 * 序列化：实现Serializable接口
 */

public class Person implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
