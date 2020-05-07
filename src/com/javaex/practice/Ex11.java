package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char str;
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳 : ");
		
		str = sc.next().charAt(0);
		
		if ('a'<=str && 'z'>=str) {
			switch(str) {
				case 'a' :
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' :
					System.out.println("모음입니다.");
					break;
				default :
					System.out.println("자음입니다.");
			}
		} else {
			System.out.println("영문 소문자만 입력해주세요.");
		}
				
		sc.close();

	}

}
