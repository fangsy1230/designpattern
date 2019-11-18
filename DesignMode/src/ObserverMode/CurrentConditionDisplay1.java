package ObserverMode;
import java.util.Observable;
import java.util.Observer; 


public class CurrentConditionDisplay1 implements Observer,DisplayElement{
	
	private Observer ob;
	private float temp;
	private float humidity;
	Observable observable;
	
	 public CurrentConditionDisplay1(Observable observable) {    
		 this.observable = observable;        
		 observable.addObserver(this);    } 

	@Override
	public void display() {
		 System.out.println("Current conditions: " + temp
				 + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData1){
			WeatherData1 weatherData1 = (WeatherData1) o;
			this.temp = weatherData1.getTemp();
			this.humidity = weatherData1.getHumidity();
			display();
		}
		
	}

}
