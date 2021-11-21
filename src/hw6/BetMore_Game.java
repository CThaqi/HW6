package hw6;

public class BetMore_Game {

	public BetMore_Game() {
	
	}
	public int Play() {
	Shuffle s=new Shuffle();
	return s.pick_card();
	}
	public Player FindWinner(Player p1,Player p2) {
		if(p1.wert<p2.wert) {
			System.out.println("Der Gewinner ist Spieler2.");
			return p2;
		}else {
			System.out.println("Der Gewinner ist Spieler1.");
			return p1;
		}
		
		
	}

}
