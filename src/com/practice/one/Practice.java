package com.practice.one;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		boolean on = true; 
		int kor = 0 ;
		int eng = 0 ;
		int math = 0;
		int total;
		float avg;
		
		while(on) {
			System.out.println("성적관리 시스템메뉴");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("숫자를 입력하세요");
			
			int num = sc.nextInt();
			switch(num) {
			
			case 1:
				System.out.println("===================");
				System.out.println("성적 입력");
				System.out.println("국어성적:");
				kor = sc.nextInt();
				System.out.println("영어성적:");
				eng = sc.nextInt();
				System.out.println("수학성적:");
				math = sc.nextInt();
				
				break;
				
			case 2:
				System.out.println("===================");
				System.out.println("성적 출력");
				System.out.printf("국어: %d\n", kor );
				System.out.printf("영어: %d\n", eng);
				System.out.printf("수학 : %d\n", math);
				total = kor+eng+math;
				avg = (float)(total / 3.0);
				System.out.printf("합계: %d\n",total);
				System.out.printf("평균: %5.2f\n",avg);
				
				//성적출력
				break;
			case 3:
				//종료
				System.out.println("종료되었습니다");
				on = false;
				break;
			}
		}
		
	}
}
