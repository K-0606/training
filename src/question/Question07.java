package question;

import java.util.Scanner;

public class Question07 {
	// 題目：輸入一行字元，分別統計出其英文字母、空格、數字和其它字元的個數。
	
	//2025.04.04 Completed
	
	public static void main(String[] args) {
		// 查Unicode字碼表
		// 英文 大寫 65~90
		// 英文 小寫 97~122
		// 空格 32
		// 數字 48~57
		// 其它字元

		int eng = 0;
		int spa = 0;
		int num = 0;
		int els = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入文字：");
		String inputString = scanner.nextLine();

		for (int i = 0; i < inputString.length(); i++) {
			int ch = (int) (inputString.charAt(i));

			if (ch >= 65 && ch <= 90) {
				eng++;
			} else if (ch >= 97 && ch <= 122) {
				eng++;
			} else if (ch == 32) {
				spa++;
			} else if (ch >= 48 && ch <= 57) {
				num++;
			} else {
				els++;
			}
		}
		System.out.printf("統計結果，%s這行句子有：\n", inputString);
		System.out.println("英文字母數量：" + eng);
		System.out.println("空格數量：" + spa);
		System.out.println("數字數量：" + num);
		System.out.println("其他數量：" + els);

		scanner.close();
	}

}
