package Creational.Singleton.CreditCard_case;

public class CreditCard {
    private static CreditCard INSTANCE = null;

    public static CreditCard getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CreditCard();
        }
        return INSTANCE;
    }
    private double balance = 500.0;

    double getBalance() {
        return balance;
    }

    void makePurchase(double amount) {
        if (amount > balance) {
            System.out.println("Can't make a purchase, Insufficient Balance!");
        } else {
            System.out.println("Purchase Success!");
            balance -= amount;
        }
    }
}
