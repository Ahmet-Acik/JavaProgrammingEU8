package day43_Abstraction;

class AA {

    private String username= "A";
    private String password = "B";

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class Login {
    public static void main(String[] args) {
        AA obj = new AA();
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
    }

}
