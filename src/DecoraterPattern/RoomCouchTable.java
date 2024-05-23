package DecoraterPattern;

public class RoomCouchTable extends RoomDecorater {

  public RoomCouchTable(Room room){
    super(room);
  }

  @Override
  public void printFurniture() {
    super.printFurniture();
    System.out.println("Table");
  }
}