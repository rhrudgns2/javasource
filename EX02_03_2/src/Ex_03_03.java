import java.util.Scanner;

public class Ex_03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ���=>");
		int first = s.nextInt();
		System.out.print("(1)���� (2) ���� (3) ���� (4) ������ => ");
		int operator = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ���=>");
		int second = s.nextInt();
		String op;
		int result;
		if(operator == 1) {
			result = first + second;
			op = "+";
		}
		else if(operator == 2) {
			result = first - second;
			op ="-";
		}
		else if(operator == 3) {
			result = first * second;
		op = "*";
		}
		else {
			result = first / second;
		op = "/";
		}
		System.out.println(first + op + second + " = " + result);
	}

}