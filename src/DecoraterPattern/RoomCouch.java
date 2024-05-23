package DecoraterPattern;

public class RoomCouch extends RoomDecorater{

  public RoomCouch(Room room){
    super(room);
  }
 
  @Override
  public void printFurniture(){
    super.printFurniture();
    System.out.println("Couch");
  }
}