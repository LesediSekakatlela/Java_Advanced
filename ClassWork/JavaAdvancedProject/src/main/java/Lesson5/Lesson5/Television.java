package Lesson5.Lesson5;

public class Television extends ElectronicDevice {

    @Override
    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    
    @Override
    public void turnOff() {
        System.out.println("Tv turned off.");
    }
    
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
    public void initializeScreen() {
        System.out.println("Tv turned on.");
    }
}