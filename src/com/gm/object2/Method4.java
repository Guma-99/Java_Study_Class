package com.gm.object2;

public class Method4 {
	// info
	// 멤버들의 정보 출력
	public void info(Member [] members) {
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].age);
			System.out.println(members[i].email);
			System.out.println("");
		}
		members = new Member[2];
	}
}
