package chapel2;

public class Maths {
	public static void main(String[] args) {
		System.out.println(pow(2, 8));
	}
	
	public static long gcd(long m, long n){
		while(n != 0){
			long temp = m%n;
			n = temp;
			m = n;
		}
		return m;
	}
	public static long pow(long x, int n){
		if(n == 0)
			return 1;
		if(n == 1)
			return x;
		if(isEven(n))
			return pow(x*x, n/2);
		else
			return pow(x*x, n/2)*x;
	}
	public static boolean isEven(int n){
		boolean result;
		if(n%2 == 0){
			result = true;
		}else
			result = false;
		return result;
	}
}
