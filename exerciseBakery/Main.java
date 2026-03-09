package exerciseBakery;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new DiamondCustomer("U Kyaw Kyaw(Diamond)","091232120",20000);
		Customer c2 = new GoldCustomer("U Aung Aung(Gold)","098235798",20000);
		Customer c3 = new Customer("Daw Su Su\t","09052798",20000);
		Customer c4 = new Customer("Daw Khaing\t","091232120",3000);
		
		System.out.println("CustomerName\t\tPhoneNumber\tAmount\t\tTotalDiscount\tTotalPay");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		

	}

}
