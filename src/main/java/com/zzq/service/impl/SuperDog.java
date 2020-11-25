package com.zzq.service.impl;

import com.zzq.service.IAnimal;

/**
 *
 * @author zhangzhiqiang
 */
public class SuperDog implements IAnimal {
    @Override
    public void talk() {
        System.out.println("i am super dog");
    }
}

