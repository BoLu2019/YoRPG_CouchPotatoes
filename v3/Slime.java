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

    //about this class
    public static String about(){
	return "This subclass of Monster that has low attack and health. It is a fairly waek monster. However, in return, defense is EXTREMELY high because who can destroy a fluid with a physical attacks? This class is intented to waste the player time in order to keep players glued to their screens.";

    }//end about()

    

}//ends class
