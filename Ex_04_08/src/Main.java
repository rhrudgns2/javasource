
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		//float a;
		//float b;
		//float result;
	 
		
		//System.out.printf("ù��° ����� ���� �Է��ϼ��� ==>");
		//a= s.nextFloat();
		//System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==>");
		//b= s.nextFloat();
		
		//result = a + b;
		//System.out.printf("%5.2f+ %5.2f = %5.2f\n", a, b, result);
		//result = a - b;
		//System.out.printf("%5.2f- %5.2f = %5.2f\n", a, b, result);
		//result = a * b;
		//System.out.printf("%5.2f* %5.2f = %5.2f\n", a, b, result);
		//result = a / b;
		//System.out.printf("%5.2f/ %5.2f = %5.2f\n", a, b, result);
		//result = (int)a % (int)b;
		//System.out.printf("%d %% %d =%d \n", (int)a, (int)b, (int) result);
		
		Scanner s = new Scanner(System.in);
		int money;
		int c500; 
		int c100; 
		int c50;
		int c10;
	
		money = s.nextInt();
		System.out.println("##��ȯ�� ����?==> ");
		money =s.nextInt();
		c500 =money / 500;
		money = money % 500;
		
		c100 = money /100;
		money = money % 100;
		
		c50 = money /50;
		money = money % 50;
		
		c10 = money /10;
		money = money % 10;
		
		System.out.printf("\n �����¥�� ==> %d �� \n", c500);
		System.out.printf("\n ���¥�� ==> %d �� \n", c100);
		System.out.printf("\n ���ʿ�¥�� ==> %d �� \n", c50);
		System.out.printf("\n �ʿ�¥�� ==> %d �� \n", c10);
		

	
	
	
	}
	
	
	

}
