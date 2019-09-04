package moppisgame.fv.TheMoppis;

import java.util.Random;

public interface DiceRoll {
	
	
	public default int RollBasic(){
		Random r=new Random();
		int result =r.nextInt(6)+1;
		return result;
		
	}
		
		


	public default void RollBonus() {
		Random r=new Random();
		int result =r.nextInt(6)+1;
		
		if(result<=3) {
			int hpExtra=25;
			
		}
		else if (result==4) {
			int forzaExtra=25;
			
		}
		else if(result==5) {
			int agilitaExtra=25;
		}
		else if(result==6) {
			int difesaExtra=25;
		}
	
		
		
	}

	
}
