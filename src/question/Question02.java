package question;

public class Question02 {

	//題目：判斷101-200之間有多少個質數，並輸出所有質數。
	
	//2025.03.24 Completed
	
	public static void main(String[] args) {
		int count = 0;
		
		for (int j = 101; j <= 200; j++) {
			if(isPrime(j)) {
				System.out.println(j);
				count++;
			}
		}
		System.out.printf("總共有：" + count);
		
	}

	public static boolean isPrime (int number) {
		for(int i = 2; i<=(number/2); i++) {
			if(number%i == 0) {
				return false;
			}			
		}
		return true;
	}
}
