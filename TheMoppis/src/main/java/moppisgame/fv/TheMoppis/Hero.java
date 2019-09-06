package moppisgame.fv.TheMoppis;

import java.util.Random;
import java.util.Scanner;

public  class Hero extends Figure  {
	
	String type;
	
	

	public Hero(String name, int hpBase, int strenghtBase, int agilityBase, int defenseBase, String type) {
		super(name, hpBase, strenghtBase, agilityBase, defenseBase);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public void Equip() {
		
		System.out.println("c-corazza, s=spada, p-pugnali");
		Scanner input=new Scanner(System.in);
		String equipHero=input.nextLine();
		
		if( equipHero.equalsIgnoreCase("c")) {
			System.out.println("hai scelto la corazza, questo aumenta la tua difesa");
			int deltaArmor=20;
			int newDefense=defenseBase+deltaArmor;
			setDefenseBase(newDefense);
			System.out.println("nuova difesa: "+defenseBase);

		} else if( equipHero.equalsIgnoreCase("s"))	{
			System.out.println("hai scelto la spada, questo aumenta la tua forza");
			int deltaStrenght=20;
			int newStrenght=strenghtBase+deltaStrenght;
			setStrenghtBase(newStrenght);
			System.out.println("nuova forza: "+newStrenght);

		} else if(equipHero.equalsIgnoreCase("p")) {
			System.out.println("hai scelto il pugnale, questo aumenta la tua agilit�");
			int deltaAgility=20;
			int newAgility=agilityBase+deltaAgility;
			setAgilityBase(newAgility);
			System.out.println("nuova agilit�: "+newAgility);
		}		
	}

	
	public void AddBonus() {
		Random r=new Random();
		int result =r.nextInt(3)+1;
		
		if( result==1) {
			System.out.println("\n"+"hai trovato pozione hp +20");
			int deltaHp=20;
			int newHp=hpBase+deltaHp;
			setHpBase(newHp);
			System.out.println("nuovi hp: "+ getHpBase());
			
		} else if( result==2)	{
			System.out.println("\n"+"fungo velenoso");
			int deltaHp=20;
			int newHp=getHpBase()-deltaHp;
			setHpBase(newHp);
			System.out.println("nuovi hp: "+ getHpBase());
			
		} else if(result==3) {
			System.out.println("\n"+"portafortuna");
			int deltaAgility=20;
			int newAgility=getAgilityBase()+deltaAgility;
			setAgilityBase(newAgility);
			System.out.println("nuova agilit�: "+newAgility);
		}
		
	}


	public void HeroDetail() {
		System.out.println("nome:"+ getName()+"|"+ "hp: "+ getHpBase()+"|"+ "forza: "+getStrenghtBase()+"|"+
							"agilit�: "+ getAgilityBase()+"|"+"difesa: " +getDefenseBase()+"\n");
	
	}
	
	 
	
	
	
	

	
	
	 
	
	
}
