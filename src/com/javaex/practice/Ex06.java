package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰수 : "+num1+"\t작은수 : "+num2+" 입니다.");
		} else if (num1 < num2) {
			System.out.println("큰수 : "+num2+"\t작은수 : "+num1+" 입니다.");
		} else {
			System.out.println("숫자2개는 동일한 숫자입니다.");
		}
		
		
		
		sc.close();

	}

}
