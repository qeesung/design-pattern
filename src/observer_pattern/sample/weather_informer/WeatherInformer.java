package observer_pattern.sample.weather_informer;

import observer_pattern.sample.WeatherData;

import java.util.Observable;

/**
 * Created by qeesung on 2016/9/18.
 */
public class WeatherInformer extends Observable{
    private WeatherData weatherData ;

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers(weatherData); // push the changed data
    }
}
