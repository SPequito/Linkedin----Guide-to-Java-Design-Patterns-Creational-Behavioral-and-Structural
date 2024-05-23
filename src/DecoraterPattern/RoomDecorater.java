package DecoraterPattern;

public abstract class RoomDecorater implements Room
 {
    private final Room room;

    public RoomDecorater(Room room){
      this.room = room;
    }

    @Override
    public void printFurniture(){
      room.printFurniture();
    }
  
}