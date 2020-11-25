package com.zzq.service.impl;

import com.google.inject.Inject;

import com.zzq.annotation.Super;
import com.zzq.service.IAnimal;

/**
 * @author zhangzhiqiang
 */
public class AnimalService {

    @Inject
    private IAnimal dog;

    /**
     * 打上了@Super的注解，Guice在注入的时候会根据在Module里面配置的绑定关系注入对应的实现类
     */
    @Inject
    @Super
    private IAnimal superDog;

    public void talk() {
        System.out.println("dog will talk");
        dog.talk();
        System.out.println("super will talk");
        superDog.talk();
    }
}

