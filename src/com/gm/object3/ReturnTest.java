package com.gm.object3;

import java.util.Random;

public class ReturnTest {

	// makeAccount
	// title, host, 계좌번호, 잔액을 입력받아서 리턴
	public Account makeAccount() {
		Account account = new Account();
		
		account.title = "자유입출금";
		account.host = "똥";
		account.number = "1424325";
		account.balance = 500L;
		
		return account;
	}

	// 호출 시 숫자를 받아서 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int[] makeRandom2(int count) {
		Random random = new Random();
		int[] nums = new int[count];

		for (int i = 0; i < count; i++) {
//			int num = random.nextInt(50);
//			nums[i] = num;

			nums[i] = random.nextInt(50); // 위에 두줄과 같은 의미

		}
		return nums;

	}

	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);

		// return 리턴하려는 Data
		return num;
	}

	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
}
