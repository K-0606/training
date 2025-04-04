package question;

import java.util.Scanner;

public class Question05 {

	//題目：利用條件運算子的巢狀來完成此題：
	//學習成績>=90分的同學用A表示，
	//	60-89分之間的用B表示，
	//	60分以下的用C表示。
	
	//2025.04.04 Completed
	
	public static void main(String[] args) {
		System.out.println("請輸入成績：");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println("您的成績是" + (score >= 90 ? "A" : (score >= 60 ? "B" : "C")));
		scanner.close();
	}

}
