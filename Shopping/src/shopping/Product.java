package shopping;

/* 추상클래스 - 객체생성 불가
 *		   - 단일 상속용으로 사용 
 * 		   - 추상메소드 + 일반메소드 가질 수 있음
 * 				일반메소드로 내리는건 공통으로 사용하는거
 * 				추상 부분적으로 바꿀때
 */

public abstract class Product {
	private String pname;
	private int price;
	
	
	
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	void printDetail() {
		System.out.println("상품이름:"+ pname);
		System.out.println("가격:"+price);
		
		}

	abstract void printExtra();
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
