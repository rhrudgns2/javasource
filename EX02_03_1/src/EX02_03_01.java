import java.util.Scanner;

public class EX02_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ��� �� ���� �Է��ϼ��� =>");
		int a = s.nextInt();
		System.out.print("�ι�° ��� �� ���� �Է��ϼ��� =>");
		int b = s.nextInt();
		System.out.print("����° ��� �� ���� �Է��ϼ��� =>");
		int c = s.nextInt();
		System.out.print("�׹�° ��� �� ���� �Է��ϼ��� =>");
		int d = s.nextInt();
		
		
		int result = a + b + c + d;
		System.out.print(a + " + " + b + " + " + c + " + " + d + " = " + result);
	}
	

}
