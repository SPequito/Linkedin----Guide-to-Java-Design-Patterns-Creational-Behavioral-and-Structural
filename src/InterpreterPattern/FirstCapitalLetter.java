package InterpreterPattern;

public class FirstCapitalLetter implements Expression {

  @Override
  public String interpret(String context){
    return context.substring(0,1).toUpperCase() + context.substring(1);
  }
  
}