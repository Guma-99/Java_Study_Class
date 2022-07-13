package com.gm.object.ex1;

import java.util.Scanner;

public class StudentController {
	// start 메서드 선언
	// System.out.println("1. 학생 정보 입력");
	// System.out.println("2. 학생 정보 조회");
	// System.out.println("3. 학생 정보 검색");
	// System.out.println("4. 학생 정보 삭제");
	// System.out.println("5. 학생 정보 추가");
	// System.out.println("6. 프로그램 종료");
	public void menu() {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student[] students = null;
		
		boolean check = true;

		while (check) {
			System.out.println("1. 입력 2. 조회 3. 검색 4. 삭제 5. 추가 6. 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1: // StudentService
				System.out.println("=====학생 정보 입력=====");
				students = ss.makeStudent();
				break;
			case 2: // StudentView
				System.out.println("=====학생 정보 조회=====");
				sv.viewAll(students);
				break;
			case 3:
				System.out.println("=====학생 정보 검색=====");
				Student student = ss.findStudent(students);
				if(student != null) {
					sv.viewOne(student);
				} else {
					sv.viewMessage("검색하신 번호의 학생이 없습니다.");
				}
				break;
			case 4:
				System.out.println("=====학생 정보 삭제=====");
				break;
			case 5:
				System.out.println("=====학생 정보 추가=====");
				break;
			case 6:
				System.out.println("=====프로그램 종료=====");
				check = !check;

			}
		}
	}
}
