/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW28 -- Ye Olde Role Playing Games
  2017-11-09
*/

public class Archer extends Protagonist{

    public Archer(String charName){
	name = charName;
	health = 150;
	strength = 50;
	defense = 55;
	attRating = 0.4;

    }//ends constructor

    //about this class
    public static String about(){
	return "This subclass of Protagonist, Archer, is one with slightly above average attack and defense, good for balanced gameplay.";

    }//end about()

    

}//ends class
