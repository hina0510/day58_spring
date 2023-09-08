package com.care.test02;

public class OperationClass {
	public int operation(int num1, int num2, String op) {
		int result = 0;
		
		
		if(num1<num2) {
			int num =num1;
			num1=num2;
			num2=num;
		}
		if (op.equals("+")) {
			result = num1+num2;
		}else if(op.equals("-")) {
			result = num1-num2;
		}else if(op.equals("*")) {
			result = num1*num2;
		}else if(op.equals("/")){
			result = num1/num2;
		}

		return result;
		
	}
}
