package com.gm.object4;

public class Car {
	String company = "쌍용";
	String brand;
	String color;
	boolean gear; // true = 자동 | false = 수동
	
	// Instance 초기화 블럭 {}
//	{
//		this.company = "기아";
//		this.brand = "K5";
//		this.color = "블랙";
//		this.gear = false;
//	}
	
	// 생성자 - 기본
	public Car() {
		
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = "White";
//		this.gear = true;
	}
	
	// 생성자 - 옵션
	public Car(String color) {
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = color;
//		this.gear = true;
		this("아반떼", color);
	}
	
	public Car(String brand, String color) {
		this.company = "현대";
		this.brand = brand;
		this.color = color;
		this.gear = true;
	}
	
	
	public void info() {
		System.out.println("Company: " + this.company);
		System.out.println("brand: " + this.brand);
		System.out.println("color: " + this.color);
		System.out.println("gear: " + this.gear);
		System.out.println("");
	}
}
