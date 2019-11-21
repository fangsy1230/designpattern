package ObserverMode;
import java.util.Observable; 

//Observable超类中有管理和注册，不需要子类去实现
public class WeatherData1 extends Observable{
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData1(){}
	//让观察者自主去获取自己想要的信息更新
	public float getTemp(){
		return temp;
	}
	public float getHumidity(){
		return humidity;
	}
	public float getPressure(){
		return pressure;
	}
	/**
	 * 。setChanged()方法可以让你在更新观察者时，有更多的弹性，你可以更 适当地通知观察者。
	 * 比方说，如果没有setChanged()方法，我们的气象站测量是如此敏锐， 以致于温度计读数每十分之一度就会更新，
	 * 这会造成WeatherData对象持续不断地通知观察 者，我们并不希望看到这样的事情发生。如果我们希望半度以上才更新，
	 * 就可以在温度差 距到达半度时，调用setChanged()，进行有效的更新
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
