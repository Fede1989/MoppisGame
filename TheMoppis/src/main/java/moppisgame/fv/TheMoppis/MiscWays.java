package moppisgame.fv.TheMoppis;

import java.util.Scanner;

public class MiscWays {
	public static String Ingresso (){

		

			Scanner n= new Scanner (System.in);
			System.out.print("TU:");
			String yourname=n.nextLine(); //NOME GIOCATORE 
			return yourname.toUpperCase();

	}
	
	
	public static void Bivio() {
		
	}

}

//esempio per richiamare nel main
//String n=Ingresso();
//System.out.println(n);