package Creational.Factory.OS_case;

public class Main {
    public static void main(String[] args) {
        OSFactory osFactory =  new OSFactory();
        OS newOS = osFactory.getInstance(OSFactory.ANDROID);

        newOS.spec();
    }
}
