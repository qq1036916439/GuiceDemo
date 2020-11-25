package com.zzq;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.zzq.service.UserService;


/**
 * @author zhangzhiqiang
 * 测试单个类的方法
 */
public class Start  {
   public static void main(final String[] args) {
        //这步就是我们问Guice去要对象
       /**
        * 使用 GUICE构建对象
        */
       final Injector injector = Guice.createInjector();
        final UserService userService = injector.getInstance(UserService.class);
        userService.say();
    }
}