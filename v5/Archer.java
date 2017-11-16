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
    public String about(){
	return "This subclass of Protagonist, Archer, is one with slightly above average attack and defense, good for balanced gameplay.";
    }//end about()
    //defend against attack by increasing defense
    public void defend(){
	defense += (int)(Math.random() * defense * .45);
	strength = (int)(Math.random() * strength);
	counterDef += 1;
	if (counterDef == 3){
	    counterDef = 0;
	    recover();
	}
	System.out.println("You cover your face with your bow.");
    }

    //recover health by defending 3 times
    public void recover(){
	int hp = (int)((Math.random() * health)*.5);
	if (health + hp > 150){
	    hp = 150 - health;
	    health += hp;
	}
	System.out.print("You catch your breath and pick yourself up. Recover : ");
	System.out.print(hp);
	System.out.println(" health.\n");       
    }
  

   

    //prepares for special attack. Lowered defense for a 100% boost in attack
    public void specialize(){
	defense *= .6;
	attRating *= 1.4;     
    }

    //resets attRating and defense to normal
    public void normalize(){
	strength = 50;
	defense = 55;
	attRating = 0.4	;
    }


    

}//ends class
