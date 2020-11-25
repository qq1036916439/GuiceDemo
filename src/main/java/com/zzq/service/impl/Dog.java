package com.zzq.service.impl;

import com.zzq.service.IAnimal;

/**
 * @author zhangzhiqiang
 */
public class Dog implements IAnimal {
    @Override
    public void talk() {
        System.out.println("i am dog!");
    }
}