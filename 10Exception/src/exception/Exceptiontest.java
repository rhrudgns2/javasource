package exception;
/*Exception �� Error(�ذ� ���� -��ǻ�� �ٿ�...)
 * 
 *Exception(����)
 *������ ���� -�ڵ��� �� ��Ŭ�������� �ٷ� �˷���
 *��Ÿ�� ���� -���� �Ҷ� ��Ÿ���� ���ܻ���
 */
public class Exceptiontest {

	public static void main(String[] args) {
		//������ ����
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();//�����ҋ� ���� ��. ��� ������ ������ �˼�����
			System.out.println("�Է°��� Ȯ���� �ּ���");
		}

	}

}
