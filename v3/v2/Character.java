/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW30 -- Ye Olde Role Playing Games, Improved
  2017-11-10
*/

public class Character {
    protected int health;
    protected int strength;
    protected int defense;
    protected double attRating;
    
    public boolean isAlive(){
	return (health > 0);//If health is zero, character is dead
    }

    //accessor to return current defense of character
    public int getDefense(){
	return defense;       
    }

    //mutator to lower health based of given dmg taken
    public void lowerHP(int dmg){
	health -= dmg;
    }

    //returns damage thats going to be dealt
    public int attack(Character x){
	int damage = 0;
	damage += (strength* attRating); //before defense is applied
	damage -= x.getDefense(); //takes into account the defense
	if(damage < 0){
	    return 0;
	}
	x.lowerHP(damage);
	return damage;
    }
}
