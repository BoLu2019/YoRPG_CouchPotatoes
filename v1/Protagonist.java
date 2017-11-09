/*
Larry Wong, Bo Hui Lu, Richard Wong (Team CouchPotatoes)
APCS1 pd08
HW28 -- Ye Olde Role Playing Games
2017-11-09
*/

public class Protagonist {

    //attributes for our character
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double attRating;

    public Protagonist(String charName){
	name = charName;
	health = 125;
	strength = 100;
	defense = 40;
	attRating = 0.4;

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
	attRating = 0.4	;
    }

    

}//ends class

