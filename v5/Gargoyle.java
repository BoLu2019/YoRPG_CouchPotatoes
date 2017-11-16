/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW28 -- Ye Olde Role Playing Games
  2017-11-09
*/

public class Gargoyle extends Monster{

    public Gargoyle(){
	health = 100;
	strength = 80;
	defense = 20;
	attRating = 1;

    }//ends constructor

    //about this class
    public static String about(){
	return "This subclass of Monster, Gargoyle, has high attack and low health. Better kill it before it kills you ";

    }//end about()
    
}//ends class
