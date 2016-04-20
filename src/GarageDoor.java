
public class GarageDoor {
	private State doorState;
	private State prevState;
	
	public GarageDoor() {
		// Door should be initially closed
		setState(doorState.CLOSED);
	}
	
	public void setState(State newState) {
		switch(newState) {
		case OPEN :
			doorState = State.OPEN;
			break;
		case CLOSED : 
			doorState = State.CLOSED;
			break;
		case REVERSE : 
			doorState = State.REVERSE;
			break;
		case STOP : 
			doorState = State.STOP;
			break;
		default:
			break;
		}
	}
	
	private void open() {
		setState(doorState.OPEN);
	}
	
	private void close() {
		setState(doorState.CLOSED);
	}
	
	private void stop() {
		setState(doorState.STOP);
	}
	
	private void onClick() {
		switch(doorState) {
		case OPENING :
			setState(prevState.OPEN);
			stop();
		case CLOSING :
			setState(prevState.CLOSING);
			stop();
		case STOP :
			// If the	door	is	opening,	and	the	door	clicker	is	“clicked,”	the	door	should	stop.		If	the	
			// clicker	is	clicked	again,	the	door	should	close.	
			if(prevState.getStateString(prevState).equals("OPEN")) close();
			else if(prevState.getStateString(prevState).equals("CLOSE")) open();
		}
		
	}
	
	private void onSafety() {
		setState(doorState.OPEN);
	}
	
	private void onLimit() {
		setState(doorState.STOP);
	}
}
