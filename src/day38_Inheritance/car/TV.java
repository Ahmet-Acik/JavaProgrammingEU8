package day38_Inheritance.car;

public class TV {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    private String brand = "";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");
    } //Parameter-less constructor

    public TV(String brand) {
        this();
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");

    } //Parameterised constructor

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel < 120) channel++;
    }

    public void channelDown() {
        if (on && channel > 1) channel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7) volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) volumeLevel--;
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

class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        TV tv2 = new TV("Sony");
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("Tv 1 is " + tv1);
        System.out.println("Tv 2 is " + tv2);
    }
}

