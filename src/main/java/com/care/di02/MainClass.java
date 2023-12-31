package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//classpath : resources 폴더를 지정하는 방법
		String path = "classpath:applicationST.xml";
		//path의 파일을 실행하고 해당 bean값을 ioc컨테이너에 등록한다
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		STBean stb = ctx.getBean("stb", STBean.class);
		//stb.setName("홍길동2");
		//stb.setAge(30);
		stb.namePrint();
		stb.agePrint();
	}
}
