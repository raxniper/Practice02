package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("기준점인 수 : ");
		num1 = sc.nextInt();
		System.out.print("약수확인 수 : ");
		num2 = sc.nextInt();
		
		if ((num1%num2)==0) {
			System.out.println(num2+"는(은) "+num1+" 의 약수입니다.");
		} else {
			System.out.println(num2+"는(은) "+num1+" 의 약수가 아닙니다.");
		}
		
		sc.close();

	}

}
