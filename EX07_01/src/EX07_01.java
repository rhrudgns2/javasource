
public class EX07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i, k;
		//
		//for(i =0; i<3; i++)
		//{
			//for (k =0; k<2; k++)
			//System.out.printf("중첩 for문입니다.(i값: %d , k값: %d)\n",i,k);

		//}
		int i, k;
		for(i= 1; i<=9; i++) {
			for (k =2; k<= 9; k++) {
					System.out.printf("%3dX%d=%2d", k, i, k *i);
			}
			System.out.printf("\n");
							
			}
		}
}


