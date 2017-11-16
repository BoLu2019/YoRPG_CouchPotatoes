//Larry Wong, Bo Hui Lu, Richard Wong (Team CouchPotatoes)
//APCS1 pd8
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character{

    //initalizes all values
    public Monster(){
	health = 300;
	strength = (int)(Math.random()*45) + 50;
	defense = 20;
	attRating = 1;

    }//end constructor


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
