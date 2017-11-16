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
    public String about(){
	return "This subclass Wizard is a Protagonist with exceptionally high magical abilities, hence increasing attRating by 2x. Does HUGEEEE damage, so watch out.";
    }
	
    //prepares for special attack. Lowered defense for a 100% boost in attack
    public void specialize(){
	defense -= 10;
	attRating *= 2.0;     
    }

    //resets attRating and defense to normal
    public void normalize(){
	defense = 40;
	attRating = 0.8	;
    }


    

}//ends class
