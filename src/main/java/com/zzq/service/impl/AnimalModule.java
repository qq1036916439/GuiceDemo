package com.zzq.service.impl;

import com.google.inject.AbstractModule;

import com.zzq.annotation.Super;
import com.zzq.service.IAnimal;


/**
 * 这里就是绑定逻辑的地方
 * @author zhangzhiqiang
 */
public class AnimalModule extends AbstractModule {
    @Override
    protected void configure() {
        // 这行的意思即是把Dog绑定给IAnimal
        bind(IAnimal.class).to(Dog.class);
        // 下面
        bind(IAnimal.class).annotatedWith(Super.class).to(SuperDog.class);
    }
}

