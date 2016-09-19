package observer_pattern.sample.weather_board;

import observer_pattern.sample.WeatherBoard;
import observer_pattern.sample.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by qeesung on 2016/9/19.
 */
public class StatisticsBoard implements Observer , WeatherBoard {
    public WeatherData weatherData = null;
    @Override
    public void update(Observable o, Object arg) {
        this.weatherData = (WeatherData)arg;
        this.display();
    }

    @Override
    public void display() {
        if(weatherData == null)
            System.out.println("no data...");
        else
            System.out.println("statistics weather is "+weatherData.getTemperature()+", "+weatherData.getHumidity()+", "+weatherData.getTemperature());
    }
}
