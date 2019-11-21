package ObserverMode;

//观察者模式定义了对象之间的一对多依赖，这 样一来，当一个对象改变状态时，它的所有依赖者都 会收到通知并自动更新。
public class Main {
	
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		
		//自带观察者模式
		WeatherData1 weatherData1 = new WeatherData1();
		CurrentConditionDisplay1 C= new CurrentConditionDisplay1(weatherData1);
		
		weatherData1.setMeasurements(80, 64, 28f);
	}

}
