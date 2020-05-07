package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// "사번"을 입력받는다.
		// "사번"에 대한 필터링 : 양의 정수(O) / 0, 음의 정수(msg: 잘못입력)
		
		// "사번"을 3으로 나누어서 나머지에 따라 A, B, C 팀 구분
		// 나머지 0 : A팀, 나머지 1 : B팀, 나머지 2 : C팀
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번 : ");
		num = sc.nextInt();
		
		if (num > 0) {
			switch ((num%3)) {
				case 0 :
					System.out.println("A팀 입니다.");
					break;
				case 1 :
					System.out.println("B팀 입니다.");
					break;
				default :
					System.out.println("C팀 입니다.");
					break;
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		sc.close();

	}

}
