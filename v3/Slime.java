/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW28 -- Ye Olde Role Playing Games
  2017-11-09
*/

public class Slime extends Monster{

    public Slime(){
	health = 20;
	strength = 5;
	defense = 90;
	attRating = 0.1;

    }//ends constructor

    public boolean isAlive(){
	return (health > 0);//If health is zero, character is dead
    }

    //accessor to return current defense of character
    public int getDefense(){
	return defense;       
    }

    //accessor to return character's name
    public String getName(){
	return name;
    }

    //mutator to lower health based of given dmg taken
    public void lowerHP(int dmg){
	health -= dmg;
    }

    //returns damage thats going to be dealt
    public int attack(Protagonist x){
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
    public void specialize(){
	defense -= 10;
	attRating *= 1.2;     
    }

    //resets attRating and defense to normal
    public void normalize(){
	defense = 40;
	attRating = 0.2	;
    }

    //about this class
    public static String about(){
	return "This subclass of Monster that has low attack and health. It is a fairly waek monster. However, in return, defense is EXTREMELY high because who can destroy a fluid with a physical attacks? This class is intented to waste the player time in order to keep players glued to their screens.";

    }//end about()

    

}//ends class
