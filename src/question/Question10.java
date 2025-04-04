package question;

public class Question10 {
	//印出9x9乘法表
	
	//2025.03.24 Completed
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int k=1; k<10; k++) {
				int s = i*k;
				System.out.printf("%d * %d = %d  ", i,k,s);
			}
			System.out.println();
		}

	}

}
