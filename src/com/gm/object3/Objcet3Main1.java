package com.gm.object3;

public class Objcet3Main1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom(); // 5
		System.out.println(num);
		
		System.out.println("=================================");
		
		int[] nums = rt.makeRandom2(5);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		
		Account account = rt.makeAccount();
		System.out.println(account.title);
		System.out.println(account.host);
		System.out.println(account.number);
		System.out.println(account.balance);
	}

}
