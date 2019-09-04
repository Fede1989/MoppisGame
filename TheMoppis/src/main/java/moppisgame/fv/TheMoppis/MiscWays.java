package moppisgame.fv.TheMoppis;

import java.util.Scanner;

public interface MiscWays {
	public static String Ingresso (){

		Scanner n= new Scanner (System.in);
		System.out.print("TU:");
		String yourname=n.nextLine(); //NOME GIOCATORE 
		return yourname.toUpperCase();

	}


}

//esempio per richiamare nel main
//String n=StartGame.Ingresso();
//System.out.println(n);