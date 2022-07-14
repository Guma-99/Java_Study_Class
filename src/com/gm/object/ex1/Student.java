package com.gm.object.ex1;

public class Student {
	private String name; // 이름
	private int number; // 번호
	private int kor; // 국어 점수
	private int math; // 수학 점수
	private int eng; // 영어 점수
	private int total; // 총점
	private double avgs; // 평균
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}

	public int getTotal() {
		return total;
	}

	public double getAvgs() {
		return avgs;
	}

	
	private int checkPoint(int point) {
		if(point < 0 || point > 100) {
			return 0;
		}
		
		return point;
	}

	public void setTotal() {
		this.total = this.kor + this.math + this.eng;
		this.setAvg();
	}
	
	public void setAvg() {
		 this.avgs = this.total / 3.0;
	}
}
