package observer_pattern.sample;

import observer_pattern.sample.weather_board.CurrentConditionsBoard;
import observer_pattern.sample.weather_board.ForecastBoard;
import observer_pattern.sample.weather_board.StatisticsBoard;
import observer_pattern.sample.weather_informer.WeatherInformer;

/**
 * Created by qeesung on 2016/9/19.
 */
public class Main {
    public static void main(String ... args){
        WeatherInformer weatherInformerPush = new WeatherInformer();
        weatherInformerPush.addObserver(new CurrentConditionsBoard());
        weatherInformerPush.addObserver(new ForecastBoard());
        weatherInformerPush.addObserver(new StatisticsBoard());
        weatherInformerPush.setWeatherData(new WeatherData(1,2,3));
        System.out.println("+++++++++++++++++++++++++++++++++");
        weatherInformerPush.setWeatherData(new WeatherData(2,3,4));
        System.out.println("+++++++++++++++++++++++++++++++++");
        weatherInformerPush.setWeatherData(new WeatherData(3,4,5));
    }
}
