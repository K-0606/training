package question;

public class Question03 {

	//題目：打印出所有的"水仙花數"
	//所謂"水仙花數"是指一個三位數，其各位數字立方和等於該數本身。
	//例如：153是一個"水仙花數"，因為153=1的三次方＋5的三次方＋3的三次方。
	
	//2025.03.24 Completed
	
	public static void main(String[] args) {

		System.out.println("水仙花數有：");
		for(int i=100; i<=999; i++) {
			int hund = i/100;
			int ten = i/10 - hund*10;
			int one = i - hund*100 - ten*10;
			if(isFlower(hund, ten, one)){
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isFlower(int hund, int ten, int one) {
		if((hund*100 + ten*10 + one) == (int)(Math.pow(hund, 3) + Math.pow(ten, 3) + Math.pow(one, 3))) {
			return true;
		}else {
			return false;
		}
	}

}
