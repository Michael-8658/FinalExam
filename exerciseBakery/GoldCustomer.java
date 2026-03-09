package exerciseBakery;

public class GoldCustomer extends Customer{
	public GoldCustomer(String name, String phone_num, double amount){
		super(name,phone_num,amount);
	}
	
	public double discount(){
		if(amount > 10000)
			return(amount * 0.1) + (0.05 * amount);
			else return (amount * 0.1);
		
	}

}
