package moppisgame.fv.TheMoppis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public  class Enemy extends Figure {

	
	String enemyType;
	
	

	public Enemy(String name, int hpBase, int strenghtBase, int agilityBase, int defenseBase, String enemyType) {
		super(name, hpBase, strenghtBase, agilityBase, defenseBase);
		this.enemyType = enemyType;
	}

	public String getEnemyType() {
		return enemyType;
	}

	public void setEnemyType(String enemyType) {
		this.enemyType = enemyType;
	}

	
	
	public void SwampEnemy() {
		Enemy n=new Enemy(name, hpBase, strenghtBase, agilityBase, defenseBase, enemyType);

		long rr=Math.round( Math.random() )  ;

		if (rr==0) {
			setName("Renzeee");
			setHpBase(90);
			setStrenghtBase(65);
			setEnemyType("swamp enemy");
			
		} else {
			setName("Zyngaretty");
			setAgilityBase(70);
			setDefenseBase(70);
			setEnemyType("swamp enemy");
		}
	}

	
	public void TowerEnemy() {
		Enemy n=new Enemy(name, hpBase, strenghtBase, agilityBase, defenseBase, enemyType);

		
		 long rr=Math.round( Math.random() )  ;

		if (rr==0) {
			setName("Il Conte Foggiano");
			setHpBase(150);
			setStrenghtBase(20);
			setEnemyType("swamp enemy");
		} else {
			setName("Giggino O'Bibbitaro");
			setAgilityBase(70);
			setEnemyType("swamp enemy");
		}

	}

	
	public void EnemyDetail() {
		System.out.println("nome:"+ getName()+"|"+ "hp: "+ getHpBase()+"|"+ "forza: "+getStrenghtBase()+"|"+
				"agilit�: "+ getAgilityBase()+"|"+"difesa: " +getDefenseBase()+"\n");		
	}
	
	

	

	

	
	

	
	
}
