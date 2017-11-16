 /*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW28 -- Ye Olde Role Playing Games
  2017-11-09
*/

public abstract class Protagonist extends Character{

    protected String name = "YouForgotYourself";

    public Protagonist(){
	health = 125;
	strength = 100;
	defense = 40;
	attRating = 0.4;
	counterDef = 0;

    }//ends constructor

    
    // accessor
    public String getName()
    {
	return name;
    }
    
    //returns damage thats going to be dealt
    public int attack(Monster x){
	int damage = 0;
	damage += (int)((Math.random() + 0.5)*(strength * attRating)); //before defense is applied
	damage -= x.getDefense() / 2; //takes into account the defense
	if(damage < 0){
	    return 0;
	}
	x.lowerHP(damage);
	return damage;
    }

    //returns the stats of the character
    public void checkStats(){
	System.out.println("\tName : " + getName());
	System.out.println("\tHealth: " + health );
	System.out.println("\tStrength: " + strength);
	System.out.println("\tAttack Rating: " + attRating);
	System.out.println("\tDefense: " + defense);
    }

    //recover health
    public abstract void recover();
    
    //defends against the next attack
    public abstract void defend();

    
    //prepares for special attack. Lowered defense for a 100% boost in attack
    public abstract void specialize();
    

    //resets attRating and defense to normal
    public abstract void normalize();

    
    //returns description of subclass
    public abstract String about();

}    
