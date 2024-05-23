package AdapterPattern;

public class FrenchLocalizedMessageClassAdapter extends FrenchLocalizedMessage implements LocalizedMessage {


  @Override
  public void sayHello() {
    sayBonjour();
  }

  @Override
  public void sayBonjour(){
    System.out.println("Bonjour MotherFucker");
  }

}