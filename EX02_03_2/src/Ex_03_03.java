import java.util.Scanner;

public class Ex_03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä=>");
		int first = s.nextInt();
		System.out.print("(1)µ¡¼À (2) »¬¼À (3) °ö¼À (4) ³ª´°¼À => ");
		int operator = s.nextInt();
		System.out.print("µÎ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä=>");
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