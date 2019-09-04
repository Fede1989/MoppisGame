package moppisgame.fv.TheMoppis;

public  class Figure   {
	
	String name;
	int hpBase;
	int strenghtBase;
	int agilityBase;
	int defenseBase;

	public Figure(String name, int hpBase, int strenghtBase, int agilityBase, int defenseBase) {
		super();
		this.name = "figuraX";
		this.hpBase = 100;
		this.strenghtBase = 50;
		this.agilityBase = 50;
		this.defenseBase = 50;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHpBase() {
		return hpBase;
	}
	public void setHpBase(int hpBase) {
		this.hpBase = hpBase;
	}
	public int getStrenghtBase() {
		return strenghtBase;
	}
	public void setStrenghtBase(int strenghtBase) {
		this.strenghtBase = strenghtBase;
	}
	public int getAgilityBase() {
		return agilityBase;
	}
	public void setAgilityBase(int agilityBase) {
		this.agilityBase = agilityBase;
	}
	public int getDefenseBase() {
		return defenseBase;
	}
	public void setDefenseBase(int defenseBase) {
		this.defenseBase = defenseBase;
	}
	

	

	
	
	
	
	
	
	
	
	
	

}
