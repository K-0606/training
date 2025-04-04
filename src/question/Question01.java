package question;

import java.util.Scanner;

public class Question01 {

	
	//1.題目：古典問題：有一對兔子，從出生後第3個月起每個月都生一對兔子，
	//小兔子長到第三個月後每個月又生一對兔子
	//假如兔子都不死，問每個月的兔子對數為多少？
	
	//2025.03.24 Completed
	
	public static void main(String[] args) {
		//1, 1, 2, 3, 5, 
		System.out.println("請輸入想知道兔子數量的月份：");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.printf("第%d個月的總數為:%d",month,cal(month));
		
		scanner.close();
	}

	private static int cal(int month)
	{
		
		if(month==1||month==2)
		{
			//因為數列的1.2項沒有前兩項，他們都是1
			return 1;
		}
		else
		{
			return cal(month-1)+cal(month-2);
		}

	}
}
