import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하세요 =>");
		int first = s.nextInt();
		System.out.print("+ - * / % =>");
		char operator = (char)System.in.read();
		System.out.print("두번째 값을 입력하세요 =>");
		int second = s.nextInt();
		int result;
		boolean b = true;
		String op = "";
		if(operator == '+') {
			result = first + second;
			op = "+";
		}
		else if(operator == '-') {
			result = first - second;
			op = "-";
		}
		else if(operator == '*') {
			 if(second == 0) {
				 System.out.println("0 으로 나누면 안됩니다.");
				 result = 0;
				 b = false;
			 }
			 else
				 	result = first / second;
			 op = "/";
		}
		else {
			if(second == 0) {
				System.out.println("0으로 나누면 나머지 값이 안됩니다.");
				result = 0;
				b = false;
			}
			else
				result = first % second;
				op ="%";
		}
		if(b ==true)
			System.out.println(first + op + second + " = " + result);
		else if(b==false)
			System.out.println("거짓이라 꺼집니다.")
	}
}
	