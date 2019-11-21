package CommandMode;

public class Main {
	
	public static void main(String[] args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light livinglight = new Light("living room");
		Light chulight = new Light("chu fang");
		LightOnCommand lightOn = new LightOnCommand(livinglight);
		LightOnCommand lightOn1 = new LightOnCommand(chulight);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(lightOn1);
		remote.buttonWasPressed();
		
	}

}
