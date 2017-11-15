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


    //about this class
    public String about(){
	return "This subclass of Protagonist that gives the user a high helth pool and defense.However, in return, the class's attack damage is lower than other classes. This class is great for long runs and is generally for less experienced players.";

    }//end about()

    //prepares for special attack. Lowered defense for a 100% boost in attack
    public void specialize(){
	defense -= 10;
	attRating *= 1.1;     
    }

    //resets attRating and defense to normal
    public void normalize(){
	defense = 70;
	attRating = 0.2	;
    }

    

}//ends class

