import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year;
		int a;
		System.out.printf("��������� �Է��ϼ���.\n");
		year = s.nextInt();
		
		a= year/ 12;
		if (a%12==0) 
			System.out.printf("���\n");
		 
		else if(a%12==1)
			System.out.printf("�Ҷ�\n");
		else if(a%12==2)
			System.out.printf("ȣ���̶�\n");
		else if (a%12==3)
			System.out.printf("�䳢��\n");
		else if (a%12==4)
			System.out.printf("���\n");
		else if (a%12==5)
			System.out.printf("���\n");
		else if (a%12== 6)
			System.out.printf("����\n");
		else if (a%12==7)
			System.out.printf("���\n");
		else if (a%12==8)
			System.out.printf("�����̶�\n");
		else if (a%12==9)
			System.out.printf("�߶�\n");
		else if (a%12==10)
			System.out.printf("����");
		else if (a%12==11)
			System.out.printf("������");
		 
		}
	}
	
		
		
		
		

		
		