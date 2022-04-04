package day_35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
       // p1.name = "Daniel";
      //  p1.age = 28;

     //   p1.name = "";
     //   p1.age = 2000;
        p1.setName("Daniel");
        p1.setAge(45);


        Person p2 = new Person();

        p2.setName("Ahmet");
        p2.setAge(35);





    //    System.out.println(p1.name +" : "+p1.age);

        System.out.println(p1.getName()+" : "+p1.getAge());
        System.out.println(p2.getName()+" : "+p2.getAge());



    }

}