import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year;
		int a;
		System.out.printf("Ãâ»ý¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.\n");
		year = s.nextInt();
		
		a= year/ 12;
		if (a%12==0) 
			System.out.printf("Áã¶ì\n");
		 
		else if(a%12==1)
			System.out.printf("¼Ò¶ì\n");
		else if(a%12==2)
			System.out.printf("È£¶ûÀÌ¶ì\n");
		else if (a%12==3)
			System.out.printf("Åä³¢¶ì\n");
		else if (a%12==4)
			System.out.printf("¿ë¶ì\n");
		else if (a%12==5)
			System.out.printf("¹ì¶ì\n");
		else if (a%12== 6)
			System.out.printf("¸»¶ì\n");
		else if (a%12==7)
			System.out.printf("¾ç¶ì\n");
		else if (a%12==8)
			System.out.printf("¿ø¼þÀÌ¶ì\n");
		else if (a%12==9)
			System.out.printf("´ß¶ì\n");
		else if (a%12==10)
			System.out.printf("°³¶ì");
		else if (a%12==11)
			System.out.printf("µÅÁö¶ì");
		 
		}
	}
	
		
		
		
		

		
		