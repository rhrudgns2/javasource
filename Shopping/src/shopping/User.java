package shopping;

public class User {
	private String name;
	private PayType Paytype;
	
	
	public User(String name, PayType paytype) {
		super();
		this.name = name;
		Paytype = paytype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PayType getPaytype() {
		return Paytype;
	}
	public void setPaytype(PayType paytype) {
		Paytype = paytype;
	}
	
	
}
