package question;

public class Question06 {
	//題目：輸入兩個正整數m和n，求其最大公約數和最小公倍數。
	
	//最大公約數（英語：greatest common divisor，gcd）
	//最小公倍數（英語：least common multiple，lcm）
	
	//2025.04.04 Completed
	
	public static void main(String[] args) {
		int gcd = getGCD(120, 12);
		System.out.println(gcd);
		
		int icm = getICM(100, 10);
		System.out.println(icm);
	}

	private static int getGCD(int m, int n) {

		if(m>=n) {
			if(m%n==0) {
				return n;
			}else {
				for(int i=n; i>=1; i--) {
					if(n%i==0 && m%i==0) {
						return i;
					}
				}
			}
		}
		if(n>m) {
			if(n%m==0) {
				return m;
			}else {
				for(int i=m;i>=1; i--) {
					if(m%i==0 && n%i==0) {
						return i;
					}
				}
			}
		}	
		return 1;
	}
	
	private static int getICM(int m, int n) {
		int gcd = getGCD(m, n);
		//歐幾里得算法 (Euclidean Algorithm)
		//是一種高效的求最大公約數的方法，時間複雜度較低
		//LCM(a, b) = (a * b) / GCD
		return (m*n)/ gcd;
	}
}
