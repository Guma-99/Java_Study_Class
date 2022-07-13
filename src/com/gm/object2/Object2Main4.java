package com.gm.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		Member member = new Member();
		member.name = "R";
		member.age = 30;
		member.email = "RRR@naver.com";
		
		Member member2 = new Member();
		member2.name = "DD";
		member2.age = 28;
		member2.email = "DDD@naver.com";
		
		Member member3 = new Member();
		member3.name = "M";
		member3.age = 33;
		member3.email = "MMM@naver.com";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 mt4 = new Method4();
		
		mt4.info(members);
		System.out.println(members.length);
		
	}

}
