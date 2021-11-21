package hw6;

import java.util.Scanner;

public class Player {
	public String name;
	public int wert;
	public Player(String n) {
		
			this.name=n;
		
	}
	
	public int Start() {
		BetMore_Game Bet=new BetMore_Game();
		 this.wert=0;
			
		if(this.name=="computer") {
			 this.wert=Bet.Play();
		}else {
			Scanner s=new Scanner(System.in	);
			int i=0;
			boolean user_selected=false;
			while(user_selected==false&&i<5) {
				System.out.print(user_selected+":1");
				 this.wert=Bet.Play();
				System.out.println(".");
				if(i<4) {	
				
					System.out.println("Ihnen verbleiben "+(4-i)+" Züge. Nochmal ziehen?"+"(Tippen Sie ja oder nein)");
					
					 String antwort = s.next();
					 System.out.println(antwort);
					if(antwort.equals("nein")) {
					user_selected=true;
					System.out.print(user_selected+":2");
					}
					
			
					
				}
				i++;
			}
			s.close();
			
		}
		
		System.out.println("Ihr Kartenwert ist: "+this.wert+".");
		return  this.wert;
		
	}

}
