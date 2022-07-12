package com.gm.object.ex1;

import java.util.Scanner;

public class Ex1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		Student stu1 = new Student(); //학생1
//		
//		stu1.name = "냥냥";
//		stu1.kor = 89;
//		stu1.math = 77;
//		stu1.eng = 70;
//		stu1.total = 236;
//		stu1.avgs = 78.6;
//		
//		System.out.println("학생이름: " + stu1.name);
//		//----------------------------------------------------------
//		Student stu2 = new Student(); //학생2
//		Student stu3 = new Student(); //학생3
		
		Student stu = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i = 0; i < 3; i++) {
			stu = new Student();
			System.out.println("이름 입력");;
			stu.name = sc.next();
			students[i] = stu;
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(stu.name);
		
		System.out.println("프로그램 종료");

	}

}
