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
	counterDef = 0;

    }//ends constructor

    //about this class
    public String about(){
	return "This subclass of Protagonist, Archer, is one with slightly above average attack and defense, good for balanced gameplay.";
    }//end about()

    
    //defend against attack by increasing defense
    public void defend(){
	defense += (int)(Math.random() * defense * .45 + 5);
	strength -= 3;
	if (defense > 70) {
	    defense = 70;
	}	    
	counterDef += 1;
	if (counterDef == 2){
	    counterDef = 0;
	    recover();
	}
	System.out.println("You brace yourself with your bow.");
    }

    //recover health by defending 2 times
    public void recover(){
	int hp = (int)((Math.random() * health)*.5);

	health += hp;
		
	System.out.print("You catch your breath and pick yourself up. Recover : ");
	System.out.print(hp);
	System.out.println(" health.\n");       
    }
  

   

    //prepares for special attack. Lowered defense for a 100% boost in attack
    public void specialize(){
	defense *= .6;
	attRating *= 1.4;
	if ( attRating > 2.0){
	    attRating = 2.0;
	}
    }

    //resets attRating and defense to normal
    public void normalize(){
	strength = 50;
	defense = 55;
	attRating = 0.4	;
    }


    

}//ends class
