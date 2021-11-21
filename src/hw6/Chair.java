package hw6;

public class Chair {
	
	BetMore_Game Bet=new BetMore_Game();
	Shuffle s=new Shuffle();
	public Chair() {
		Player Computer=new Player("computer");	
		Computer.Start();
		Player Player2=new Player("player2");
		Player2.Start();	
		Bet.FindWinner(Computer, Player2);
	}

	public static void main(String[] args) {
		Chair c=new Chair();

	}
	

}
