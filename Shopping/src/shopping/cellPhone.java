package shopping;

public class cellPhone extends Product {
	
	//��Ż�
	private String carrier;

	public cellPhone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}
	
	
	@Override
	void printExtra() {
		System.out.println("��Ż� ���� : "+carrier);
	}
	
}
