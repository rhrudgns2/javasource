import java.util.Scanner;
public class EX07_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str;
		char ch;
		int i, k;
		int star;
		
		System.out.printf("���� �������� �Է� :");
		str =s.nextLine();
		i=0;
		ch = str.charAt(i);
		while (true) {
			star = (int) ch -48;
			
			for(k= 0; k< star; k++)
				System.out.printf("*");
			System.out.printf("\n");
			
			if(++i >str.length()-1)
				break;
		ch = str. charAt(i);
		}

	}
		
}


