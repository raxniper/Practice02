package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 다음 코드를 실행했을 때 결과를 예상한 후 코드를 작성해 확인해보시오.
		
		/* 예상
		 * 나이를 입력해주세요
		 * 나이 :
		 * 20 초과를 입력한다면, "1번그룹" (줄바꿈) 입니다.
		 * 20 이하를 입력한다면, "2번그룹" (줄바꿈) 입니다.
		 */
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.println("나이 : ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}
