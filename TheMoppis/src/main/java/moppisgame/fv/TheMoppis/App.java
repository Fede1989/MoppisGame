package moppisgame.fv.TheMoppis;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends MiscWays{

	public static void main( String[] args )
	{


		Hero h= new Hero(null, 0, 0, 0, 0, null);


		String yourname=Ingresso();
		System.out.println("impostare nome eroe diverso?");
		System.out.println("(s=si n=no)");

		Scanner input=new Scanner(System.in); String heroName=input.nextLine();

		if (heroName.equalsIgnoreCase("s")) { Scanner sc=new Scanner(System.in);
		String name=sc.nextLine(); h.setName(name.toUpperCase()); }else {
			h.setName(yourname.toUpperCase()); }

		h.AddBonus();

		h.HeroDetail();

		Enemy e = new Enemy(null, 0, 0, 0, 0, null);


		e.TowerEnemy();

		System.out.println("Oh no "+e.getName()+" vuole il tuo voto!");
		e.EnemyDetail();

		Enemy e1 =new Enemy(null, 0, 0, 0, 0, null);
		e1.SwampEnemy();
		System.out.println("No a "+e1.getName()+" non gliene frega nulla della tua opinione");
		e1.EnemyDetail();
		e.EnemyDetail();






	}
}
