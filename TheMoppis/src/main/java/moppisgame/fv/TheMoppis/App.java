package moppisgame.fv.TheMoppis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Hero h= new Hero(null, 0, 0, 0, 0, null);
        h.AddBonus();
        h.HeroDetail();
        
        Enemy e = new Enemy(null, 0, 0, 0, 0, null);
        
        
        e.TowerEnemy();
        
        System.out.println("Oh no "+e.getName()+" vuole il tuo voto!");
        
        e.EnemyDetail();
        

        
        
    }
}
