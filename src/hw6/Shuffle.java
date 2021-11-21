package hw6;

public class Shuffle {
	private static int cardNumber;
	public Shuffle() {
		// TODO Auto-generated constructor stub
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public int pick_card() {
		cardNumber=(int)(Math.random()*100);
		
		return cardNumber;
	}
	
	

}
