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
	strength = 70;
	defense = 50;
	attRating = 0.7;
	counterDef = 0;

    }//ends constructor


    //about this class
    public String about(){
	return "This subclass of Protagonist that gives the user a high helth pool and defense.However, in return, the class's attack damage is lower than other classes. This class is great for long runs and is generally for less experienced players.";

    }//end about()

    //defend against attack by increasing defense
    public void defend(){
	defense += (int)(Math.random() * defense);
	strength -= 3;
	if (defense > 70) {
	    defense = 70;
	}	
	counterDef += 1;
	if (counterDef == 2){
	    counterDef = 0;
	    recover();
	}
	System.out.println("You quickly put up a shield.");
    }

    //recover health by defending 2 times
    public void recover(){
	int hp = (int)((Math.random() * health)*.5 + 5);

	health += hp;
		
	System.out.print("You catch your breath and pick yourself up. Recover : ");
	System.out.print(hp);
	System.out.println(" health.\n");       
    }
    
    //prepares for special attack. Lowered defense for a 100% boost in attack
    public void specialize(){
	defense *= .7;
	attRating *= 1.1;
	if ( attRating > 2.0){
	    attRating = 2.0;
	}
    }

    //resets attRating and defense to normal
    public void normalize(){
	strength = 70;
	defense = 30;
	attRating = 0.2	;
    }

    

}//ends class

