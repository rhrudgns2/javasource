
public class Ex09_25 {

static short getNumber() {
	return  (short) (Math.random() * 45+1);
}
	public static void main(String[] args) {
			short[] lotto = {0,0,0,0,0,0};
			short i, k ,num;
			char dup1 ='N';
		
			System.out.printf("**�ζ� ��÷�� �����մϴ�.**\n\n");
				
				for(i =0; i<6;) {
				num = getNumber();
				
				for(k =0; k<6; k++)
					if (lotto[k] == num)
						dup1 = 'Y';
				if(dup1 == 'N')
					lotto[i++] = num;
				else
					dup1 = 'N';
				}
			System.out.printf("��÷�� �ζ� ��ȣ ==>");
			for(i =0; i<6; i++) {
				System.out.printf("%d", lotto[i]);
			}
	}

}
