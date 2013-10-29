/******************************************************************************************
 * 
 * 
 * 	Step 4
 *
 *		Instructions
 *			
 *			Karel has malfunctioned and forgotten the
 *			alphabet! Team up with a few other students
 *			to teach Karel how to write all of the letters
 *			(plus spaces and punctuation). Divide the
 *			characters up amongst your team, then share
 *			your working code with each other to complete
 *			the final goal.
 *
 *			Karel will write by placing beepers down in a 
 *			pattern. The letter A might look like this:
 *
 *						****
 *						*  *		* is a beeper
 *						****
 *						*  *
 *			
 *			After writing a character Karel should be placed 
 *			in a position to immediately write another one.
 *			Karel will start with an infinite number of beepers
 *			so don't worry about using too many.
 *
 *		Goal
 *
 *			When Karel knows the alphabet, make him/her write
 *			the sentence:
 *			
 *			"The quick brown fox jumps over the *@#!$^% lazy dog!?!!?!"
 *			
 *			Remember to break up your code into methods!
 * 
 * 
 ******************************************************************************************/

// includes the necessary files to know what a robot does
import kareltherobot.*;

// starts the definition of a Step2 object that has all of the functionality
// of a normal robot plus whatever you add here
public class Step4 extends Robot {
	
	// Constructor
	// 		sets up the Robot based on the code in runner
	//		do not change
	public Step4(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	// start
	// 		makes the robot go
	public void start() {
		
		
	}

	// Java always looks for this method to start your program
	// Every program you write should have one and only one
	// method named main
	public static void main(String[] args) {
		World.readWorld("largeWorld.kwld");
		World.setVisible(true);
		World.setDelay(15);
		Step4 karel = new Step4(2, 2, Directions.East, infinity);
		karel.start();
	}

}
