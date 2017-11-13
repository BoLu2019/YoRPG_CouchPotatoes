//Larry Wong, Bo Hui Lu, Richard Wong (Team CouchPotatoes)
//APCS1 pd8
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character{

    //attributes for out monster
    //private String name;
    private int health;
    private int strength;
    private int defense;
    private double attRating;

    //initalizes all values
    public Monster(){
	health = 150;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	attRating = 1;

    }//end constructor

    //checks of health is greater than 0
    public boolean isAlive(){
	return health > 0;
    }//end isAlive()

    //accessor to return current defense of character
    public int getDefense(){
	return defense;       
    }

    //mutator to lower health based of given dmg taken
    public void lowerHP(int dmg){
	health -= dmg;
    }

    //returns damage thats going to be dealt
    public int attack(Protagonist x){
	int damage = 0;
	damage += (strength * attRating); //before defense is applied
	damage -= x.getDefense(); //takes into account the defense
	if(damage < 0){
	    return 0;
	}
	x.lowerHP(damage);
	return damage;
    }






}//end Monster Class
