package CommandMode;

public class Light {
	public String location;
	public Light(String location){
		this.location = location;
	}
	public void on(){
		System.out.println(location + " Light is on");
	}
	
	public void off(){
		System.out.println(location + " Light is off");
	}

}
