package com.practice.one;

import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		int current = 0;

		
		boolean on = true; 
		
		int num;
		while(on) {
			num = menuSystem();
			switch(num) {
			
			case 1:
				
			inputList(exams,current);
			break;
			case 2:
				outputList(exams,current);
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
	private static void outputList(Exam[] exams,int size) {
		System.out.println("===================");
		System.out.println("성적 출력");
			for(int i=0; i<size; i++) {
			Exam exam=exams[i];
			int kor = exam.kor;
			int eng =exam.eng;
			int math =exam.math;
			
			int total = exam.total;
			float avg = exam.avg;
				
				System.out.printf("국어:%d \n",kor);
				System.out.printf("영어:%d \n",eng);
				System.out.printf("수학:%d \n",math);
				
				total = kor+eng+math ;
				avg = total / 3.0f;
				
				System.out.printf("합계: %d\n",total);
				System.out.printf("평균: %5.2f\n",avg);
		}
	}
	
	private static void inputList(Exam[] exams,int current) {
		
		
			int kor,eng,math;
			int total;
			float avg ;
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("===================");
			System.out.println("성적 입력");
			
				System.out.printf("국어성적:");
				kor = sc.nextInt();
				System.out.printf("영어성적:");
				eng = sc.nextInt();
				System.out.printf("수학성적:");
				math = sc.nextInt();
				
				Exam exam = new Exam();
				exam.kor =kor;
				exam.eng = eng;
				exam.math = math;
				
				exams[current] = exam;
				current++;
		
	}
	static int menuSystem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적관리 시스템메뉴");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		return num;
	}



	}

