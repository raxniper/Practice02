package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		// 수익을 입력받아, 소득세 계산기 만들기
		
		// 세금계산법
		// ( 0 <= mny && mny <= 1,000) : tax = 0.09 * 수익
		// (1,000 < mny && mny <= 4,000) : tax = 1000*0.09 + 0.18*(mny-1000)
		// (4,000 < mny && mny < 8,000) : tax = 1000*0.09 + 3000*0.18 + 0.27*(mny-4000)
		// (8,000 <= mny) : tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(mny-8000)
		
		Scanner sc = new Scanner(System.in);
		
		int mny;
		double tax=0;
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익 : ");
		mny = sc.nextInt();
		
		if (0<=mny) {
			if (mny>=0 && mny<=1000) {
				tax = mny * 0.09;
			} else if (1000<mny && mny<=4000) {
				tax = 1000*0.09 + 0.18*(mny-1000);
			} else if (4000<mny && mny<8000) {
				tax = 1000*0.09 + 3000*0.18 + 0.27*(mny-4000);
			} else if (8000<=mny) {
				tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(mny-8000);
			}
			System.out.println("소득세는 "+tax+" 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	
		sc.close();
	}
}
