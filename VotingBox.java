/* 	Karel moves across punch card ballot spaces 
 * where user attempted to cast ballot 
 * Legislators determined voter intent is indicated by the 
 * status of the beeper in the middle.
 * 
 * Karel's job is to do some cleaning
 */

import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
        move();
        checkMiddleBeeper();
        removeExtraBeepers();
        move();
		}
	}
	private void checkMiddleBeeper() {
		if (beepersPresent()) {
        move();
        move();
		}
	}
	private void removeExtraBeepers() {
		if (noBeepersPresent()) {
        removeBeepersDown();
        removeBeepersUp();
    }
}
/* Karle standing middle no beeper present 
 * Karel moves down picks beeper if present 
 * returns to the middle facing up
 */
	
	private void removeBeepersDown() {
		turnRight();
		move();
	while (beepersPresent()) {
        pickBeeper();
    }
		turnAround();
		move();
}
/* Karl moves up and picks beepers if present 
 * Karl returns to middle facing east 
 */
	
	private void removeBeepersUp() {
		move();
    if (frontIsClear()) {
        move();
    }
    
    while (beepersPresent()) {
        pickBeeper();
    }
    
    	turnAround();
    	move();
    	turnLeft();
 

    }
		
				
		
}
