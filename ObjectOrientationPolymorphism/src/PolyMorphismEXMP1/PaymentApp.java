package PolyMorphismEXMP1;

public class PaymentApp {
	public static void main(String[] args) {
		Payment ref;
		ref=new UPI();
		ref.checkBalance();
		ref.applyCode();
		ref.sendNotification();
		ref.pay();
		System.out.println("--------------------------------");
		
		ref=new Card();
		ref.checkBalance();
		ref.applyCode();
		ref.sendNotification();
		ref.pay();
		System.out.println("--------------------------------");
		
		ref=new Wallet();
		ref.checkBalance();
		ref.applyCode();
		ref.sendNotification();
		ref.pay();
		System.out.println("--------------------------------");
		
		
		
		
		
	}

}
