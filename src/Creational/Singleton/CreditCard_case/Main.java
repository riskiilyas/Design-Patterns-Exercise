package Creational.Singleton.CreditCard_case;

public class Main {
    public static void main(String[] args) {
        CreditCard myCard = CreditCard.getInstance();
        CreditCard myCardBorrowed = CreditCard.getInstance();

        System.out.println("MyCard Balance = $" + myCard.getBalance());
        System.out.println("BorrowedCard Balance = $" + myCardBorrowed.getBalance());

        myCard.makePurchase(120.0);

        System.out.println("BorrowedCard Balance = $" + myCardBorrowed.getBalance());
    }
}
