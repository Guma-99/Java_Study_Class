package com.gm.object2;

public class Object2Main3 {
	
	public static void main(String[] args) {
		Method3 mt3 = new Method3();
		
		int salary = 5000000;
		mt3.sal(salary);
		System.out.println(salary);
		
		//mt3.hap(10);
		mt3.info("A", 30, "A@naver.com");
		
		Member member = new Member();
		
		member.name = "ABC";
		member.age = 22;
		member.email = "ABC@naver.com";
		
		mt3.info2(member);
		System.out.println(member.age);
	}
}
