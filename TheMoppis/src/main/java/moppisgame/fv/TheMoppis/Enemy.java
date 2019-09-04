package moppisgame.fv.TheMoppis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public  class Enemy extends Figure implements SettingEnemy {

	
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

	
	@Override
	public void GenerateEnemy() {
		

		
	}

	@Override
	public void TowerEnemy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EnemyDetail() {
		System.out.println("nome:"+ getName()+"|"+ "hp: "+ getHpBase()+"|"+ "forza: "+getStrenghtBase()+"|"+
				"agilit�: "+ getAgilityBase()+"|"+"difesa: " +getDefenseBase()+"\n");		
	}
	
	

	

	

	
	

	
	
}
