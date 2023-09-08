package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	String path = "classpath:application_test.xml";
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
	PrintBean prb = ctx.getBean("prb", PrintBean.class);
	//getBean("﻿application의 PrintBean 클래스로 받는 bean name", PrintBean.class)
	prb.setPrint("홍길동");
	prb.printString();
}
}
