package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		Myshop shop =new Myshop();
		
		//�����̸� ����
		shop.setTitle("�츮����");
		//User ����
		shop.genUser();
		//��ǰ ����
		shop.genProduct();
		//���� ����
		shop.start();
	}

}
