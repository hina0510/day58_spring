package com.care.test02;

public class PrintClass {
public void printFunc(int num1, String op, int num2, int result) {
	if(num1<num2) {
		int num =num1;
		num1=num2;
		num2=num;
	}	
	System.out.println(num1+op+num2+"="+result);
}
}
