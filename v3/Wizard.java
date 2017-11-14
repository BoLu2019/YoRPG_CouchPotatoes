/*
  Bo Hui Lu, Larry Wong, Richard Wong (Team CouchPotatoes)
  APCS1 pd08
  HW31 --Ye Olde Role Playing Game, Expanded .
  2017-11-14
*/

public class Wizard extends Protagonist{

    public Wizard(String charName){
	name = charName;
	health = 125;
	strength = 100;
	defense = 40;
	attRating = 0.8;


    }//ends constructor

    //about this class
    public static String about(){
	return "This subclass Wizard is a Protagonist with exceptionally high magical abilities, hence increasing attRating by 2x. Does HUGEEEE damage, so watch out.";

    }//end about()

    

}//ends class
