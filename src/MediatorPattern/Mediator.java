package MediatorPattern;

public class Mediator {

  private PedestrianCrossingLight pedestrianCrossingLight;
  private TrafficLight trafficLight;

  public Mediator(PedestrianCrossingLight pedestrianCrossingLight, TrafficLight trafficLight){
    this.trafficLight = trafficLight;
    this.pedestrianCrossingLight = pedestrianCrossingLight;
  }

  public void changeColorRed(){
    trafficLight.changeToRed();
    pedestrianCrossingLight.changeToGreen();

  }

  public void changeColorAmber() {
    trafficLight.changeToAmber();;
   
  }

  public void changeColorGreen() {
    pedestrianCrossingLight.changeToRed();
    trafficLight.changeToGreen();
    

  }
  
}