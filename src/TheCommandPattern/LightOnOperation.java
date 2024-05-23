package TheCommandPattern;

public class LightOnOperation implements LightOperation{

  private final Light light;

  public LightOnOperation(Light light){
    this.light= light;
  }

  @Override
  public void execute(){
    light.turnOnLight();
  }
}