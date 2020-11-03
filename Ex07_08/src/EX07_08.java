import java.util.Scanner;


public class EX07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.printf("더할 첫번째 수 입력 :");
			a = s.nextInt();
			System.out.printf("더할 두번째수 입력 :");
			b = s.nextInt();
			if( a==0)
				break;
			
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		}
		
		System.out.printf("0을 입력해서 반복문을 탈출했습니다.");
		}

	}

