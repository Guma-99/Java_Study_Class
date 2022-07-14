package com.gm.object.ex1;

public class StudentView {
	
	// viewMessage
	// 문자열을 받아서 그 문자열을 출력
	public void viewMessage(String message) {
		System.out.println(message);
	}
	
	// viewOne
	// 학생 한명의 정보를 받아서 모든 정보를 출력
	public void viewOne(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNumber());
		System.out.println(student.getTotal());
		System.out.println(student.getAvgs());
	}
	
	// viewAll
	// 학생들의 정보를 받아서 모든 정보 출력
	public void viewAll(Student[] students) {
		Student stu = new Student();
		StudentService ss = new StudentService();

		for (int i = 0; i < students.length; i++) {
			System.out.println("이름\t 번호\t 국어\t 수학\t 영어\t 총점\t 평균");
			System.out.println(students[i].getName() + "\t " + students[i].getNumber() + "\t " + students[i].getKor() + "\t " + students[i].getMath() + "\t "
					+ students[i].getEng() + "\t " + students[i].getTotal() + "\t " + students[i].getAvgs());
		}

		System.out.println("=====조회 완료=====");
		System.out.println("");
	}
}