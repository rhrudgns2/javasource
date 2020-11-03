import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int aa[] = {100, 200, 300, 400};
	//	int bb[] = new int[] {100,200,300 };
		
		//int cc[];
		//cc = new int[] {100,200};
		//int[] dd =new int [1];
		//dd[0] =100;
		//int i;
		
	//	for (i = 0; i< 4; i++)
		//	System.out.printf("aa[%d]==> %d\t",i,aa[i]);
		//System.out.printf("\n");
		
		//for (i = 0; i< 3; i++)
		//	System.out.printf("bb[%d]==> %d\t",i,bb[i]);
		//System.out.printf("\n");
		
	//	for (i = 0; i< 2; i++)
			//System.out.printf("cc[%d]==> %d\t",i,cc[i]);
	//	System.out.printf("\n");
	
		//for (i = 0; i< 1; i++)
	//		System.out.printf("dd[%d]==> %d\t",i,dd[i]);
		//System.out.printf("\n");
		int aa[] = {10, 20, 30, 40, 50, 60};
		int count, size;
		
		count = aa.length;
		size = count * Integer.BYTES;
		
		System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다. \n",count);
		System.out.printf("배열 aa[]의 요소의 개수는 %d 바이트 입니다. \n",size);
	}
		
	}


