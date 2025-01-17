package ObserverPattern;

import java.beans.PropertyChangeSupport;

public class Location {

    private String weatherEvent;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setWeatherEvent(String weatherEvent) {
        support.firePropertyChange("weatherEvent", this.weatherEvent, weatherEvent);
        this.weatherEvent = weatherEvent;
    }

    public void addListener(WeatherUpdates weatherUpdates ) {
        support.addPropertyChangeListener(weatherUpdates);
    }

}