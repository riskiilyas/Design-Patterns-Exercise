package Creational.Builder.Phone_case;

public class PhoneBuilder {
    private String OS;
    private int battery;
    private int memory;
    private int camera;
    private int storage;

    void setOS(String OS) {
        this.OS = OS;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Phone build() {
        return new Phone(OS, battery, memory, storage, camera);
    }
}
