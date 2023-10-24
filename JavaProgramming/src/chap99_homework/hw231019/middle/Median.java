﻿//package edu.exam09.homework;
package chap99_homework.hw231019.middle;

import java.util.Scanner;
//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.

class Median {
	static int med3(int a, int b, int c) {
		//여기를 완성하세요.
	
		int medNum = 0;
		
		if(a>b && a<c || a<b && a>c) {
			medNum = a;
		}else if(b>a && b<c || b<a && b>c){
			medNum = b;
		}else if(c>a && c<b || c<a && c>b){
			medNum = c;
		}
		
		return medNum;
	} 

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
		if(a <= 1000 && b <= 1000 && c <= 1000) {
			System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		

		
	}
}
