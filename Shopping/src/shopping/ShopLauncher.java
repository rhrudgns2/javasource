package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		Myshop shop =new Myshop();
		
		//상점이름 지정
		shop.setTitle("우리가게");
		//User 생성
		shop.genUser();
		//제품 생성
		shop.genProduct();
		//상점 시작
		shop.start();
	}

}
