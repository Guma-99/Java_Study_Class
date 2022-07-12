package com.gm.object.ex1;

import java.util.Scanner;

public class Ex1Main2 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		Student stu = new Student();
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름 입력");
			stu.name = sc.next(); //A, B, C
			students[i] = stu;
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].name);
		}
		
		
		System.out.println("프로그램 종료");
	}
}
