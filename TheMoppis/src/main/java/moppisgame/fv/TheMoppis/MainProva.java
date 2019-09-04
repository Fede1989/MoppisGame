package moppisgame.fv.TheMoppis;
import java.util.*;
import java.io.*;


public class MainProva implements MiscWays  {

	public static void main(String[] args)  {
	
		
	Hero yyy=new Hero(null, 0, 0, 0, 0, null);
	yyy.HeroDetail();
	yyy.Equip();
	yyy.AddBonus();
	yyy.HeroDetail();
	
	Enemy xxx=new Enemy(null, 0, 0, 0, 0, null);
	xxx.EnemyDetail();
		
		
	}
}
