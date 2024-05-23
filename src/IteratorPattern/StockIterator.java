package IteratorPattern;

import java.util.Iterator;

public class StockIterator implements Iterator <Country> {
  
  private final Inventory inventory;
  private int index;

  public StockIterator (Inventory inventory){
    this.inventory = inventory;
    this.index = 0; 
  }
  
  @Override
  public boolean hasNext(){
    var countrieList = inventory.getCountries();
    return index < countrieList.length;
  }

  @Override
  public Country next() {
    var countries = inventory.getCountries();
    if (hasNext()){
      return countries[index++];
      }else{
      return null;
    }  
  }
}