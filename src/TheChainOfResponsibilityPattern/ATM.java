package TheChainOfResponsibilityPattern;

public abstract class ATM {
    
    public ATM nextAtm;

    public ATM(ATM nexAtm){
        this.nextAtm = nexAtm;
    }

    public abstract void dispense(WithdrawalRequest request);

}