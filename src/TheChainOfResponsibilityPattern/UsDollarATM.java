package TheChainOfResponsibilityPattern;

import TheChainOfResponsibilityPattern.WithdrawalRequest.Currency;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nextAtm){
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (nextAtm != null) {
            nextAtm.dispense(request);
        }
    }


}