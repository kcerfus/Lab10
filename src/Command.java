
public class Command {

	private boolean isOn = false;
	private boolean lightClick, doorClick, limitSwitch, safetyTrigger;
	
	
	public boolean getIsOn() { return isOn; }
	public boolean getLightClick() { return lightClick; }
	public boolean getDoorClick() { return doorClick; }
	public boolean getLimitSwitch() { return limitSwitch; }
	public boolean getSafetyTrigger() { return safetyTrigger; }
	
	public void execute(String command) {
		switch(command) {
		case "ON" :
			isOn = true;
			break;
		case "OFF" :
			isOn = false;
			break;
		case "LCLICK" :
			lightClick = true;
			break;
		case "DCLICK" :
			doorClick = true;
			break;
		case "LIMIT" :
			limitSwitch = true;
			break;
		case "SAFETY" :
			safetyTrigger = true;
			break;
		}
	}
}
