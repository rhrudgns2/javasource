import java.util.Scanner;


public class EX06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int hap = 0;
		//int i;
		
		//for(i=501; i <=1000; i=i+2) {
			//hap += i;
		//}
		//System.out.printf("500���� 1000������ Ȧ���� ��: %d \n", hap);		
		Scanner s = new Scanner(System.in);
			int i;
			int dan;
			
			System.out.printf("�� ��?");
			dan =s.nextInt();
			
			for (i= 1; i <=9; i++ ) {
			System.out.printf("%d * %d =%d \n", dan, i, dan*i );
			}
				
		
	}
	}


