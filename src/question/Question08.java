package question;

public class Question08 {
	//題目：求s=a+aa+aaa+aaaa+aa…a的值
	//其中a是一個數字。假設a=2，項次為3，則輸出結果的形式如：2+22+222=246；
	
	//2025.04.04 Completed
	
	public static void main(String[] args) {
		//a = a*10 + a
		int a = 2;
		int num = 4;
		
		int res = 0;
		int changeA = a;
		//res =  res + changeA;
		//changeA = a + changeA*10;
		
		for(int i=0; i<num; i++) {
			res = res + changeA;
			changeA = changeA* 10+ a;
		}
		System.out.println(res);
	}

}
