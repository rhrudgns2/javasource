import java.util.Scanner;

public class EX02_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산 할 값을 입력하세요 =>");
		int a = s.nextInt();
		System.out.print("두번째 계산 할 값을 입력하세요 =>");
		int b = s.nextInt();
		System.out.print("세번째 계산 할 값을 입력하세요 =>");
		int c = s.nextInt();
		System.out.print("네번째 계산 할 값을 입력하세요 =>");
		int d = s.nextInt();
		
		
		int result = a + b + c + d;
		System.out.print(a + " + " + b + " + " + c + " + " + d + " = " + result);
	}
	

}
