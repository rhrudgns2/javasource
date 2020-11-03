
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 35;
		int c =200;
		
		int result1;
		int mok;
		int namugi;
		float result2;
		
		result1 = a + b - c;
		System.out.printf(" %d + %d - %d = %d\n", a, b, c, result1);
		
		result1 = a + b + c;
		System.out.printf("%d + %d + %d = %d\n", a, b, c, result1);
		
		result2 = a + b / (float)c;
		System.out.printf("%d + %d / %d = %f\n", a, b, c, result2);
		
		mok = c /b;
		System.out.printf("%d / %d = %d\n", c, b, mok );
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d\n", c, b, namugi);
		
	}

}
