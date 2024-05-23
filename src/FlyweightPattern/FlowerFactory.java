package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

  private static final Map<String, Flower> flowerCache = new HashMap<>();

  public static Flower createFlower(String flowerName){
    if (flowerCache.containsKey(flowerName)){
      return flowerCache.get(flowerName);
    }
    var flower = new Flower(flowerName);
    flowerCache.put(flowerName,flower);
    return flower;

    /* we can use to this method 
     * return flowerCache.computeIfAbsent(flowerName, Flower::new);
     * this dos the same but can be more hardest to read.
     */
  }
}