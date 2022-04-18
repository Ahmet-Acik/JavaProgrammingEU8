package day38_Inheritance.car;

import day38_Inheritance.TV;

public class TvTest {
    public static void main(String[] args) {


        TV myTv = new TV();

        myTv.isOn();
        myTv.setBrand("Sony");
        myTv.setChannel(3);
        myTv.setVolumeLevel(20);

        System.out.println("myTv = " + myTv);


        System.out.println("----------------------------");

        myTv.volumeDown(8);
        myTv.channelDown(130);

        System.out.println("myTv now is = " + myTv);


    }
}
