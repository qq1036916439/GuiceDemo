package com.zzq.dao;

import com.google.inject.Singleton;


/**
 * @author zhangzhiqiang
 * @Singleton
 * 打上了这个标记说明是单例的，否则Guice每次回返回一个新的对象
 */
@Singleton
public class UserDao {
	public void say() {
		System.out.println("dao is saying");
	}
}