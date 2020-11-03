package shopping;

public class cellPhone extends Product {
	
	//통신사
	private String carrier;

	public cellPhone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}
	
	
	@Override
	void printExtra() {
		System.out.println("통신사 정보 : "+carrier);
	}
	
}
