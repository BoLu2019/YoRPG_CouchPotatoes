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
	defense = 30;
	attRating = 0.8;
	counterDef = 0;


    }//ends constructor

    //about this class
    public String about(){
	return "This subclass Wizard is a Protagonist with exceptionally high magical abilities, hence increasing attRating by 2x. Does HUGEEEE damage, so watch out.";
    }

    //defend against attack by increasing defense
    public void defend(){
	defense += (int)(Math.random() * defense * .5);
	strength -= 3;
	if (defense > 70) {
	    defense = 70;
	}
	counterDef += 1;
	if (counterDef == 2){
	    counterDef = 0;
	    recover();
	}
	System.out.println("You put up an impromptu barrier");
    }

    //recover health by defending 2 times
    public void recover(){
	int hp = (int)((Math.random() * health)*.4 + 5);

	health += hp;
	
	System.out.print("You catch your breath and pick yourself up. Recover : ");
	System.out.print(hp);
	System.out.println(" health.\n");       
    }
	
    //prepares for special attack. Lowered defense for a 100% boost in attack
    public void specialize(){
	defense *= .5;
	attRating *= 2.0;
	if ( attRating > 2.0){
	    attRating = 2.0;
	}
    }

    //resets attRating and defense to normal
    public void normalize(){
	defense = 40;
	attRating = 0.8	;
	strength = 100;
    }


    

}//ends class
