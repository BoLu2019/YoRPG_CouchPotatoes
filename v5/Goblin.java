/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW31 --Ye Olde Role Playing Game, Expanded .
  2017-11-14
*/

public class Goblin extends Monster{

    public Goblin(){
	health = 250;
	strength = (int)(Math.random()*45) + 20;
	defense = 20;
	attRating = 1;


    }//ends constructor

    //about this class
    public static String about(){
	return "This subclass Goblins is a Monster with higher hit points, while maintaining the same stats for the others. Meant to frustrate the player since it'll take longer to kill.";

    }//end about()

    

}//ends class
