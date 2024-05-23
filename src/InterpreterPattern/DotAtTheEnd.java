package InterpreterPattern;

public class DotAtTheEnd implements Expression  {

  private final FirstCapitalLetter firstCapitalLetter = new FirstCapitalLetter();

  @Override
  public String interpret(String context) {
    if(!context.endsWith(".")){
      context += ".";
    }
    return firstCapitalLetter.interpret(context);
  }
  
}