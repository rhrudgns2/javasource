package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Myshop implements IShop {

	//���θ� �̸�
	private String title;
	//��� ��ǰ ����
	Product[] products = new Product[10];
	//��ٱ���

	
	
	ArrayList<Product> carts = new ArrayList<Product>();
	//�����
	User user[] = new User[2];
	//Ű���� �Է�ó��
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	@Override
	public void setTitle(String title) {
		this.title =title;
	}

	@Override
	public void genUser() {
		//���θ������ ���� �� �迭�� ���
		//User ��ü�� �̿�
//		User User1 = new User("ȫ�浿", PayType.CARD);
//		User User1 = new User("������", PayType.CASH);
		
		user[0] =new User("ȫ�浿", PayType.CARD);
		user[1] =new User("������", PayType.CASH);
		
		
	}

	@Override
	public void genProduct() {
		//���θ����� �Ǹ��ϴ� ��ǰ����
		//CellPhone,SmartTV ���� 5��������
		products[0] = new SmartTV("�Ｚ��Ʈ��HD",3500000,"4K");
		products[1] = new SmartTV("����",1500000,"Full HD");
		products[2] = new SmartTV("���",2500000,"4K");
		products[3] = new SmartTV("�Ｚ����Ʈ",8500000,"4K");
		products[4] = new SmartTV("��������Ʈ",800000,"4K");
		products[5] = new SmartTV("������11",1000000,"4K");
		products[6] = new SmartTV("�Ｚ��Ʈ",1120000,"4K");
		products[7] = new SmartTV("�Ｚ������",1200000,"skt");
		products[8] = new SmartTV("������12",1500000,"kt");
		products[9] = new SmartTV("LGX-500",800000,"lg");
		

	}

	@Override
	public void start() {
		//���� ��ü�� ����, �����ϴ� �޼ҵ�
		System.out.println(title+ " :����ȭ��- ��������");
		System.out.println("======================");
		
		int i=0;
		for(User u:user) {
			System.out.printf("[%d] %s(%s)\n",i++,u.getName(),u.getPaytype());
		}
		System.out.println("[x]��  ��");
		System.out.println("����: ");
	
		//��������� user ��ȣ�� �Է¹��� �� ��ǰ ��� ����ϱ�
		//0,1,x
		String input =scan.next();
		
		switch(input) {
		case "0": case "1":
			System.out.println("###"+input+" ���� ###");
			selUser= Integer.parseInt(input);
			productList();
			break;
		case "x": case"X":
			System.out.println("shop�� �����մϴ�.");
			
		default:
			System.out.println("\n�Է°��� Ȯ���� �ּ���\n");
			break;
		}
	}

	
	public void productList() {
		//��ǰ��� ����ϱ�

		System.out.println(title+ " :����ȭ��- ��������");
		System.out.println("==========================");

		int i=0;
		for(Product p:products) {
			System.out.printf("[d]",i++);
			p.printDetail();
			
			System.out.println("[h] ����ȭ��");
			System.out.println("[c] üũ�ƿ�");
			System.out.println("���� :");
			
			//0~9, h, c
			String input =scan.next();
			//�Է°��� ���� ó���ϱ�
			switch (input) {
			case "h":
				start();
			case "c":
				checkout();
				break;
			case "0":case "1": case "2": case "3":
			case "4":case "5": case "6": case "7":
			case "8":case "9":
				//īƮ�� ���
				carts.add(products[Integer.parseInt(input)]);
				//�ٽ� ��ǰ��� �����ֱ�
				productList();
			default:
				System.out.println("�Է°��� Ȯ�����ּ���");
				productList();
				break;
			}
		}
			}
		public void checkout() {
			//
			System.out.println(title+" : üũ�ƿ�");
			System.out.println("================================");
			
			int i=0;
			int total=0; //��ٱ��� �ݾ� �հ�
			for(Product p:carts) {
				System.out.printf("[%d]%s(%s)\n",i++,p.getPname(),p.getPrice());
				total += p.getPrice(); //��ٱ��� ���� �� �հ� ���ϱ�
			}
			System.out.println("================================");
			
			System.out.println("���� ��� : "+user[selUser].getPaytype());
			System.out.println("�հ� : "+total+"�� �Դϴ�." );
			System.out.println("[p] ����, [q] ���� �Ϸ�");
			System.out.println("���� :");
			
			//p ����ȭ������ ������
			//q ���α׷� ����
			String input =scan.next();
			switch (input) {
			case "p":
				productList();
				break;
			case "q":
				checkout();
				break;
			default:
				System.out.println("�Է°��� Ȯ�����ּ���");
				checkout();
				break;
			}
		}
}