package com.gm.object.ex1;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// StudentController의 start 메서드 호출
		StudentController sc = new StudentController();
		
		sc.menu();
		
		System.out.println("프로그램 종료");

	}

}
