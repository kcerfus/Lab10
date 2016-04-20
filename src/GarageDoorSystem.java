
public class GarageDoorSystem {
	private GarageDoor gd;
	private Command cmnd;
	
	public GarageDoorSystem() {
		cmnd = new Command();
		System.out.println("State: " + cmnd.getIsOn());
	}
	
	public void On() {
		cmnd.execute("ON");
	}
	
	public void Off() {
		cmnd.execute("OFF");
	}
	
	public static void main(String args[]) {
		new GarageDoorSystem();
		GarageDoor gd = new GarageDoor();
		State newState = State.OPEN;
	}
}
