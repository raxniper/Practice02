package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// 다음 오류 코드의 내용을 올바르게 수정하시오.
		int age = 15;
		
		// 수정 전 : age가 0살 초과이고 18살 미만이면
		/*
		if(0<age<18) {
			System.out.println("청소년 입니다.");
		}
		*/
		
		// 수정 후
		if(age>0 && age<18) {
			System.out.println("청소년 입니다.");
		}

	}

}
