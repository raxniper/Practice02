package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		// ｘ<=0, ｘ³-9ｘ+2
		// ｘ> 0, 7ｘ+2
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		double result=0;
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자 : ");
		num = sc.nextInt();
		
		if (num<=0) {
			result = (num*num*num)-(9*num)+2;
		} else if (num>0) {
			result = (7*num)+2; 
		}
		
		System.out.println("계산결과는 "+result+"입니다.");
		
		sc.close();

	}

}
