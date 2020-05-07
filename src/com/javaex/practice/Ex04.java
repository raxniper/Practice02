package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 다음 코드를 실행했을 때 결과를 예상한 후 코드를 작성해 확인해보시오.
		
		/* 나이를 입력해주세요
		 * 나이 :
		 * 
		 * 문제) 나이를 입력받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하시오.
		 */
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if(age>=19 && age<65) {
			System.out.print("\"1번그룹\"");
		} else {
			System.out.print("\"2번그룹\"");
		}
		System.out.print("입니다.");
		
		sc.close();

	}

}
