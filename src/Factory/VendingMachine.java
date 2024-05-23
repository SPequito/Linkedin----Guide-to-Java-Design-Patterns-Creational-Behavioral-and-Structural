/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author stefa
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import javax.imageio.IIOException;

public class VendingMachine {

    //1----> create a hashmap were you going to save objects and they can be call later
    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>();

    static {
        // we pass our key that is the name and next we create a new Chips object at this case is the price
        snackMap.put("Chips", Chips::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
        snackMap.put("Drink", Drink::new);
    }

  public  Snack getSnack(String snackType) throws IllegalAccessException {
// we are see if we have something in our map if we have nice give you your object else send you a msg error
        if(snackMap.get(snackType) != null){
                return snackMap.get(snackType).get();

        }else {
            throw new IllegalAccessException("wrong type of snackType");
        }
    }


}
