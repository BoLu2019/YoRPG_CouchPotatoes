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

    }//ends constructor

    
    // accessor
    public String getName()
    {
	return name;
    }
    
    //returns damage thats going to be dealt
    public int attack(Monster x){
	int damage = 0;
	damage += (strength* attRating); //before defense is applied
	damage -= x.getDefense(); //takes into account the defense
	if(damage < 0){
	    return 0;
	}
	x.lowerHP(damage);
	return damage;
    }

    //prepares for special attack. Lowered defense for a 100% boost in attack
    public abstract void specialize();
    
    

    //resets attRating and defense to normal
    public abstract void normalize();

    

    public abstract String about();

    

}//ends class

