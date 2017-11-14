/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW28 -- Ye Olde Role Playing Games
  2017-11-09
*/

public class Warrior extends Protagonist{

    public Warrior(String charName){
	name = charName;
	health = 200;
	strength = 50;
	defense = 70;
	attRating = 0.2;

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
	return "This subclass of Protagonist that gives the user a high helth pool and defense.However, in return, the class's attack damage is lower than other classes. This class is great for long runs and is generally for less experienced players.";

    }//end about()

    

}//ends class

