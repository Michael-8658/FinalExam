package exerciseBakery;

public class DiamondCustomer extends Customer{
	public DiamondCustomer(String name, String phone_num, double amount){
		super(name,phone_num,amount);
	}
	
	public double discount(){
		if(amount > 10000)
			return (amount * 0.2) + (amount * 0.02);
		else return (amount * 0.2);
	}

}
