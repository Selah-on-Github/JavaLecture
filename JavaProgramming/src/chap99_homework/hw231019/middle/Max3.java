﻿package chap99_homework.hw231019.middle;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
//		sc.close();
		
		int max = a;
		
		/*
		이곳에 적절한 코드를 넣으세요
		*/
		int[] num = new int[3];
		
		num[0] = a;
		num[1] = b;
		num[2] = c;
		
		
		//최댓값 구하기
		max = num[0];
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최댓값 : " + max);
		
		
		//최솟값 구하기
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최솟값 : " + min);
		
		
		

		System.out.println("최댓값은 " + max + "입니다.");
		
		
	}
}