package TheVisitorPattern;

public interface Visitor {
  
  void visit(AdultTicket adultTicket);
  void visit(GroupTicket groupTicket);
}