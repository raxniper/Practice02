package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int bigNum;
		int smallNum;
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		
		if (num1 >= num2) {
			bigNum = num1;
			smallNum = num2; 
		} else {
			bigNum = num2;
			smallNum = num1;
		}
		
		System.out.println("몫 : "+(bigNum/smallNum));
		System.out.println("나머지 : "+(bigNum%smallNum));
		
		
		
		sc.close();

	}

}
