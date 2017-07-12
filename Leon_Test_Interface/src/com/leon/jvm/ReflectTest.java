package com.leon.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//加载com.leon.jvm中的类
		Class<?> class1 = Class.forName("com.leon.jvm.InterfaceTest");
		
		//获取类中的所有方法
		Method[] methods = class1.getDeclaredMethods();
		
		//遍历所有的方法
		for (Method method : methods) {
			System.out.println(method.toString());
		}
		System.out.println("-------------------");
		
		//获取类的所有常量
		Field[] fields = class1.getDeclaredFields();
		
		//遍历所有常量
		for (Field field : fields) {
			System.out.println(field.toString());
		}
	}
}
