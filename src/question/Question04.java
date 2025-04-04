package question;

public class Question04 {
	// 題目：將一個正整數分解質因數。例如：輸入90,打印出90=2*3*3*5。
	
	//2025.03.24 Completed
	
	public static void main(String[] args) {
		factorization(90);
	}

	public static void factorization(int i) {
		System.out.print(i + "=");
		boolean first = true;

		for (int a = 2; a <= i; a++) {
			while (i % a == 0) {
				if (first) {
					System.out.print(a);
					i = i / a;
					first = false;
				} else {
					System.out.print("*");
					System.out.print(a);
					i = i / a;
				}

			}

		}
	}
}
