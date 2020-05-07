package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 기호, 숫자1, 숫자2 순서로 입력받기
		// 기호 : 4종류 ( + / - / × / ÷ )
		// 입력된 내용으로 계산하여 결과값 출력
		// cf. 나눗셈의 경우, 분모가 0이면 "계산할 수 없습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		String cal="0";
		int num1=0;
		int num2=0;
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호( + / - / × / ÷ ) : ");
		cal = sc.nextLine();
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		
		switch (cal) {
			case "+" :
				System.out.println("결과는 : " + (num1 + num2));
				break;
			case "-" :
				System.out.println("결과는 : " + (num1 - num2));
				break;
			case "*" :
				System.out.println("결과는 : " + (num1 * num2));
				break;
			case "/" :
				switch (num2) {
					case 0 : 
						System.out.println("계산할 수 없습니다.");
						break;
					default :
						System.out.println("결과는 : " + (num1 / num2));
				}
				break;
			default :
				System.out.println("계산할 수 없는 기호입니다.");
		}
		sc.close();
	}
}
