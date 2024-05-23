package TheStrategyPattern;

public interface Authenticator {
  void play();

  Authenticator payWithCardAuthenticator = () -> System.out.println("Payment made with card");

  Authenticator payByBankTransfer = () -> System.out.println("Payment made by bank transfer");
}