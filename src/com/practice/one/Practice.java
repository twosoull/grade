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
			System.out.println("�������� �ý��۸޴�");
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.println("���ڸ� �Է��ϼ���");
			
			int num = sc.nextInt();
			switch(num) {
			
			case 1:
				System.out.println("===================");
				System.out.println("���� �Է�");
				System.out.println("�����:");
				kor = sc.nextInt();
				System.out.println("�����:");
				eng = sc.nextInt();
				System.out.println("���м���:");
				math = sc.nextInt();
				
				break;
				
			case 2:
				System.out.println("===================");
				System.out.println("���� ���");
				System.out.printf("����: %d\n", kor );
				System.out.printf("����: %d\n", eng);
				System.out.printf("���� : %d\n", math);
				total = kor+eng+math;
				avg = (float)(total / 3.0);
				System.out.printf("�հ�: %d\n",total);
				System.out.printf("���: %5.2f\n",avg);
				
				//�������
				break;
			case 3:
				//����
				System.out.println("����Ǿ����ϴ�");
				on = false;
				break;
			}
		}
		
	}
}
