package IteratorPattern;

import java.util.Iterator;

public class Inventory implements Iterable<Country> {

  private final Country[] countries;

  public Inventory(Country... countries){
    this.countries = countries;
  }

  @Override
    public Iterator<Country> iterator(){
      return new StockIterator(this);
    }

  public Country[] getCountries(){
    return countries;
  }
}