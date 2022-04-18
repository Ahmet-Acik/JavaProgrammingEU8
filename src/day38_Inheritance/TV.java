package day38_Inheritance;

public class TV {

    //declare variables
    private int channel = 1, volumeLevel = 0;
    private boolean on = false;
    private String brand = "undefined";

    //Parameter-less constructor
    public void TV() {
        System.out.println("Creating TV object using no args-constructor");

    }

    //Parameterised constructor
    public void TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    // Channel Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
    // If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
    public void channelUp(int channel) {
        if (this.channel > 120 && this.channel <=0 &&!isOn() ) {
            System.out.println("\"ERROR: TV is either OFF or invalid Channel\"");
        }
        this.channel+= channel;
    }

    public void channelDown(int channel) {
        if (this.channel > 120 && this.channel <=0 && !isOn()) {
            System.out.println("\"ERROR: TV is either OFF or invalid Volume level\" ");
            }
        this.channel -=channel;
    }

    //  Volume can only be in the range between 0 and 7. You may change volume only if TV is on. Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level".
    // Use isOn() method that will check tv status.

    public void volumeUp(int volumeLevel) {

        if (this.volumeLevel > 7 && this.volumeLevel <= 0 && !isOn()) {
            System.out.println("\"ERROR: TV is either OFF or invalid Volume level\" " + volumeLevel);
        }
        this.volumeLevel += volumeLevel;
    }

    public void volumeDown(int volumeLevel) {
        if (this.volumeLevel > 7 && this.volumeLevel <= 0 && !isOn()) {
            System.out.println("\"ERROR: TV is either OFF or invalid Volume level\" " + volumeLevel);
        }
        this.volumeLevel-=volumeLevel;
    }


    // Create isOn(), turnOn() and turnOff() methods for on instance variable. If tv is already on, no need to turn it on again, display message: "TV is already ON". If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
    public boolean isOn() {
        if (!on) {
            System.out.println("\"TV is already ON\"  ");
        }
        return on;
    }

    public boolean turnOn() {
        if (isOn()) {
            System.out.println("\"TV is already ON\" ");
        }
        return on;
    }

    public void turnOff() {
        if (!isOn()) {
            System.out.println("\"TV is already OFF\" ");
        }

    }


    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                ", brand='" + brand + '\'' +
                '}';
    }
}


/*
Write a custom class TV that has 4 instance variables:

int channel=1, int volumeLevel=0, boolean on = false, String brand = "undefined".
Create one no arguments constructor that prints message: "Creating TV object using no args-constructor".

Also, create one more constructor that defines instance variable brand, and displays message:"Creating TV object using 1 arg - constructor".

Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.

Create isOn(), turnOn() and turnOff() methods for on instance variable. If tv is already on, no need to turn it on again, display message: "TV is already ON". If tv is already off, then no need to turn it off again, display message: "TV is already OFF".

Channel Value of a variable channel cannot be negative or zero, and cannot be higher than 120. If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".

Volume can only be in the range between 0 and 7. You may change volume only if TV is on. Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level". Use isOn() method that will check tv status.


 */
