package com.practice.one;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Exam exam = new Exam();
		boolean on = true; 
		
		int num;
		while(on) {
			num = menuSystem(exam);
			switch(num) {
			
			case 1:
				
			inputExam(exam);
			break;
			case 2:
				outputExam(exam);
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
	static int menuSystem(Exam exam) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적관리 시스템메뉴");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		return num;
	}
	static void outputExam(Exam exam) {
		System.out.println("===================");
		System.out.println("성적 출력");
		int[] grade = exam.grade;
		int[] total = exam.total;
		float[] avg = exam.avg;
		for(int j=0; j<3; j++) {
			for(int i=0; i<3; i++){
			System.out.printf("%d국어%3d: %3d\n",j+1,i+1,grade[3*j+i]);
			
			total[j] += + grade[3*j+i];
			avg[j] = (float)(total[j] / 3.0);
			}
			System.out.printf("합계: %d\n",total[j]);
			System.out.printf("평균: %5.2f\n",avg[j]);
		}
		
		
	}
	static void inputExam(Exam exam) {
		int[] grade = exam.grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("===================");
		System.out.println("성적 입력");
		for(int j=0; j<3; j++) {
			for(int i =0; i<3; i++) {
			System.out.printf("%d학년국어%3d성적:",j+1,i+1);
			grade[3*j+i] = sc.nextInt();
			}
		}
	
		
	}
}
