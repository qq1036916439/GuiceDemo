package com.zzq;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.zzq.service.impl.AnimalModule;
import com.zzq.service.impl.AnimalService;

/**
 * 测试单个类的方法。
 * @author zhangzhiqiang
 */
public class MainStart {

    public static void main(final String[] args) {
        final Injector injector = Guice.createInjector(new AnimalModule());
        final AnimalService animalService = injector.getInstance(AnimalService.class);
        animalService.talk();
    }
}

