package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String  str = "Cats Cats Dogs Dogs cAt CAT caT";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub =    str.substring(i, i+3 );

            if(eachSub.equalsIgnoreCase("Cats")){
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}
