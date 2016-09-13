package Labfive;

public class MagicRollDice {

	
	// declare the instance varaiables and make private
	
	private int sides =0;
	private int roll=0;
	
	
	//initialize your variables inside of the constructor 
	
	public MagicRollDice() { 
		 		sides = 0; roll = 0;
		  	}


	

	//create the setter method with keyword void This method doesn't return data

	public void setSides(int sides) { 
		 		this.sides = sides; 
		}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}

	//create getter method this method returns data 
	
	public int getRoll() {
		return roll;
	}

	public int getSide() {
		return sides;
	}


	
	//create the 'rollDice' method.
    
	public int rollDice(int s) { 
		 		roll = (int) Math.ceil(Math.random() * sides);
		  		return roll; 
		 	}
		 

	
	

	
	
	
	
	
	
	
	
	
	
	//declare, and then create a return statement in the body of the method

	
	
}

