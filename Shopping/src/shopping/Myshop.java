package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Myshop implements IShop {

	//쇼핑몰 이름
	private String title;
	//등록 상품 정보
	Product[] products = new Product[10];
	//장바구니

	
	
	ArrayList<Product> carts = new ArrayList<Product>();
	//사용자
	User user[] = new User[2];
	//키보드 입력처리
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	@Override
	public void setTitle(String title) {
		this.title =title;
	}

	@Override
	public void genUser() {
		//쇼핑몰사용자 생성 후 배열에 담기
		//User 객체를 이용
//		User User1 = new User("홍길동", PayType.CARD);
//		User User1 = new User("성춘향", PayType.CASH);
		
		user[0] =new User("홍길동", PayType.CARD);
		user[1] =new User("성춘향", PayType.CASH);
		
		
	}

	@Override
	public void genProduct() {
		//쇼핑몰에서 판매하는 제품생성
		//CellPhone,SmartTV 각각 5개씩생성
		products[0] = new SmartTV("삼성울트라HD",3500000,"4K");
		products[1] = new SmartTV("엘지",1500000,"Full HD");
		products[2] = new SmartTV("대우",2500000,"4K");
		products[3] = new SmartTV("삼성스마트",8500000,"4K");
		products[4] = new SmartTV("엘지스마트",800000,"4K");
		products[5] = new SmartTV("아이폰11",1000000,"4K");
		products[6] = new SmartTV("삼성노트",1120000,"4K");
		products[7] = new SmartTV("삼성갤럭시",1200000,"skt");
		products[8] = new SmartTV("아이폰12",1500000,"kt");
		products[9] = new SmartTV("LGX-500",800000,"lg");
		

	}

	@Override
	public void start() {
		//목적 자체가 제어, 시작하는 메소드
		System.out.println(title+ " :메인화면- 계정선택");
		System.out.println("======================");
		
		int i=0;
		for(User u:user) {
			System.out.printf("[%d] %s(%s)\n",i++,u.getName(),u.getPaytype());
		}
		System.out.println("[x]종  료");
		System.out.println("선택: ");
	
		//사용자한테 user 번호를 입력받은 후 제품 목록 출력하기
		//0,1,x
		String input =scan.next();
		
		switch(input) {
		case "0": case "1":
			System.out.println("###"+input+" 선택 ###");
			selUser= Integer.parseInt(input);
			productList();
			break;
		case "x": case"X":
			System.out.println("shop을 종료합니다.");
			
		default:
			System.out.println("\n입력값을 확인해 주세요\n");
			break;
		}
	}

	
	public void productList() {
		//제품목록 출력하기

		System.out.println(title+ " :메인화면- 계정선택");
		System.out.println("==========================");

		int i=0;
		for(Product p:products) {
			System.out.printf("[d]",i++);
			p.printDetail();
			
			System.out.println("[h] 메인화면");
			System.out.println("[c] 체크아웃");
			System.out.println("선택 :");
			
			//0~9, h, c
			String input =scan.next();
			//입력값에 의해 처리하기
			switch (input) {
			case "h":
				start();
			case "c":
				checkout();
				break;
			case "0":case "1": case "2": case "3":
			case "4":case "5": case "6": case "7":
			case "8":case "9":
				//카트에 담기
				carts.add(products[Integer.parseInt(input)]);
				//다시 상품목록 보여주기
				productList();
			default:
				System.out.println("입력값을 확인해주세요");
				productList();
				break;
			}
		}
			}
		public void checkout() {
			//
			System.out.println(title+" : 체크아웃");
			System.out.println("================================");
			
			int i=0;
			int total=0; //장바구니 금액 합계
			for(Product p:carts) {
				System.out.printf("[%d]%s(%s)\n",i++,p.getPname(),p.getPrice());
				total += p.getPrice(); //장바구니 물건 값 합계 구하기
			}
			System.out.println("================================");
			
			System.out.println("결제 방법 : "+user[selUser].getPaytype());
			System.out.println("합계 : "+total+"원 입니다." );
			System.out.println("[p] 이전, [q] 결제 완료");
			System.out.println("선택 :");
			
			//p 이전화면으로 돌리기
			//q 프로그램 종료
			String input =scan.next();
			switch (input) {
			case "p":
				productList();
				break;
			case "q":
				checkout();
				break;
			default:
				System.out.println("입력값을 확인해주세요");
				checkout();
				break;
			}
		}
}