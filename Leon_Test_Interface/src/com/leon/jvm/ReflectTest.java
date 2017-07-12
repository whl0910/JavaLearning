package com.leon.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//����com.leon.jvm�е���
		Class<?> class1 = Class.forName("com.leon.jvm.InterfaceTest");
		
		//��ȡ���е����з���
		Method[] methods = class1.getDeclaredMethods();
		
		//�������еķ���
		for (Method method : methods) {
			System.out.println(method.toString());
		}
		System.out.println("-------------------");
		
		//��ȡ������г���
		Field[] fields = class1.getDeclaredFields();
		
		//�������г���
		for (Field field : fields) {
			System.out.println(field.toString());
		}
	}
}
