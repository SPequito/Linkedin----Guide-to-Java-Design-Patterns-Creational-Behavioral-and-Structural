package FactoryAbstract;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
  

  private static final Map<String, Supplier<UserInterfaceFactory>> interfaceColor = new HashMap<>();
    
  
  //create a hash with your color and interface were he see if the color is support or not
      static{
        interfaceColor.put("BLUE", UserInterfaceBlueFactory::new);
        interfaceColor.put("RED", UserInterfaceRedFactory::new);
      }
      public static UserInterfaceFactory createFactory(String colors){
          if (interfaceColor.get(colors) != null){
            return interfaceColor.get(colors).get();
          }else{
              throw new IllegalArgumentException("We dont have that color");

}


}
}
