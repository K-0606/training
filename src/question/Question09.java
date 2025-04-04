package question;

public class Question09 {
	//題目：一個數如果恰好等於它的因子之和，這個數就稱為"完數"。
	//例如6=1＋2＋3.程式設計找出1000以內的所有完數。
	
	//2025.04.04 Completed
	
	public static void main(String[] args) {
		
		for(int i=1; i<1000; i++) {
			isPerfectNum(i);
		}	
	}
	
	
	 public static void isPerfectNum(int perfect) {
		 int total = 1;
			for(int i=2; i<=perfect/2; i++) {
				if(perfect%i==0) {
					total = total +i;
				}
			}
			if(total==perfect) {
				System.out.println(total);
			}
	 }
	
	
}
