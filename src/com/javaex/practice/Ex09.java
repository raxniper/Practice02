package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int bigNum;
		int smallNum;
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		
		if (num1 >= num2) {
			bigNum = num1;
			smallNum = num2; 
		} else {
			bigNum = num2;
			smallNum = num1;
		}
		
		
		if ((bigNum%smallNum)==0) {
			System.out.println(smallNum+"는(은) "+bigNum+"의 약수입니다.");
		} else {
			System.out.println(smallNum+"는(은) "+bigNum+"의 약수가 아닙니다.");
		}
		
		sc.close();

	}

}
