package TheVisitorPattern;

public interface TicketElement {

    int getPrice();

    void accept(Visitor visitor);

}