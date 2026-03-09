package exerciseBakery;

public class Customer implements Discountable{
	private String name;
	private String phone_num;
	protected double amount;
	
	public Customer(){
		
	}
	
	public Customer(String name,String phone_num, double amount){
		this.name = name;
		this.phone_num = phone_num;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString(){
		return name + "\t" + phone_num + "\t" + amount + "\t\t" + discount() +"\t\t"+(amount - discount());
	}

	@Override
	public double discount() {
		double discount = 0.0;
		if(amount > 10000){
			discount = amount * 0.05;
		}
		return discount;
	}

	
	
	

	
	
}
