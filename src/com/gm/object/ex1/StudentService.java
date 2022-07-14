package com.gm.object.ex1;

import java.util.Scanner;

public class StudentService {
	Scanner sc;
	
	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	// removeStudent
	// 학생들의 정보를 받아서,
	// 삭제하려는 학생의 번호를 입력 받음
	// 학생의 번호와 일치하는 학생의 정보을 삭제
	// 남은 학생들의 정보를 리턴
	
	// addStudent
	// 학생들의 정보를 받아서,
	// 학생 한 명 추가
	// 학생 정보들을 리턴
	public void addStudent() {
		Student student = null;
		
		
		
	}
	
	
	// findStudent
	// 검색하고 싶은 학생의 번호를 입력
	// 같은 번호의 학생 찾아서 학생 한 명을 리턴
	// 없으면 null 리턴
	public Student findStudent(Student[] students) {
		
		Student student = null; // 리턴하려는 학생 데이터

		System.out.println("검색할 학생 번호 입력");
		int fs = sc.nextInt();

		for (int i = 0; i < students.length; i++) {
			if (fs == students[i].getNumber()) {
				student = students[i];
				break;
			}
		}
		return student;
	}

	// makeStudents
	// 학생 수를 입력 받고,
	// 학생 수만큼 정보 입력 받고,
	// 학생들을 리턴
	public Student[] makeStudent() {
																																																																																																				
		// Student stu= new Student();

		System.out.println("학생 수 입력");
		int num = sc.nextInt();
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println(i + 1 + "번째 학생 이름");
			student.setName(sc.next());
			System.out.println(" - 번호");
			student.setNumber(sc.nextInt());
			System.out.println(" - 국어 점수");
			student.setKor(sc.nextInt());
			System.out.println(" - 수학 점수");
			student.setMath(sc.nextInt());
			System.out.println(" - 영어 점수");
			student.setEng(sc.nextInt());
			student.setTotal();
			
			students[i] = student;

			System.out.println("=====입력 완료=====");
			System.out.println("");

		}
		return students;
	}

}

//		stu.name = new String[num]; // 이름
//		stu.number = new int[stu.name.length]; // 번호
//		stu.kor = new int[stu.name.length]; // 국어 점수
//		stu.math = new int[stu.name.length]; // 수학 점수
//		stu.eng = new int[stu.name.length]; // 영어 점수
//		stu.total = new int[stu.name.length]; // 총점
//		stu.avgs = new double[stu.name.length]; // 평균