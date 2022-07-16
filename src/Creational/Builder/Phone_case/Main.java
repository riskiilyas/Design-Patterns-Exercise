package Creational.Builder.Phone_case;

public class Main {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilde = new PhoneBuilder();
        phoneBuilde.setBattery(5000);
        phoneBuilde.setCamera(64);
        phoneBuilde.setMemory(8);
        phoneBuilde.setOS("ANDROID");
        phoneBuilde.setStorage(128);

        Phone phoneInstance = phoneBuilde.build();
        phoneInstance.spec();
    }
}
