package AdapterPattern;


public class FrenchLocalizedMessageObjectAdapter implements LocalizedMessage {

  private final FrenchLocalizedMessage frenchLocalizedMessage;

  public FrenchLocalizedMessageObjectAdapter(){
    frenchLocalizedMessage = new FrenchLocalizedMessage();
  }

  @Override
  public void sayHello() {
    frenchLocalizedMessage.sayBonjour();
    
  }
  
}