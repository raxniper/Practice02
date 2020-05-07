package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 표준체중 = (키-100)*0.9
		Scanner sc = new Scanner(System.in);
		
		int height;				// 키
		int weight;				// 몸무게
		float standard_weight;	// 표준체중
		String ment;			// 출력멘트
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 : ");
		height = sc.nextInt();
		System.out.print("몸무게 : ");
		weight = sc.nextInt();
		
		standard_weight = (height-100)*0.9f; 
		
		if ((weight-2)<standard_weight) {
			ment = "저체중";
		} else if ((weight+2)>standard_weight) {
			ment = "과체중";
		} else {
			ment = "표준";
		}
		
		System.out.println("\n표준체중은 \""+standard_weight+"\"kg 이며, \n당신의 체중은 표준체중과 \""+(weight-standard_weight)+"\"kg 차이가 나는 \""+ment+"\"입니다.");
		
		sc.close();

	}

}
