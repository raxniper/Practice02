package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		int smallNum=0;
		
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		System.out.print("숫자3 : ");
		num3 = sc.nextInt();
		
		if (num1<num2 && num1<num3) {
			smallNum = num1;
		} else if (num2<num1 && num2<num3) {
			smallNum = num2;
		} else {
			smallNum = num3;
		}
		
		System.out.println("가장 작은 수는 "+smallNum+" 입니다.");
		
		sc.close();

	}

}
