package Creational.Builder.Phone_case;

public class Phone {
    private String OS;
    private int battery;
    private int memory;
    private int storage;
    private int camera;

    public Phone(String OS,int battery, int memory, int storage, int camera) {
        this.OS = OS;
        this.battery = battery;
        this.memory = memory;
        this.storage = storage;
        this.camera = camera;
    }

    public void spec() {
        System.out.println("OS: " + OS);
        System.out.println("Battery: " + battery);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Camera: " + camera);
    }
}
