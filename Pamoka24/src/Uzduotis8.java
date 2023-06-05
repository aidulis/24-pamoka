public class Uzduotis8 {
    public static void main(String[] args) {

        String rezultatas1 = patikrintiArSkaiciaiVienodiSuDesimtaineDalim(20.50510F, 20.50520F);
        String rezultatas2 = patikrintiArSkaiciaiVienodiSuDesimtaineDalim(4.5894F, 6.6875F);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);


    }
    public static String patikrintiArSkaiciaiVienodiSuDesimtaineDalim(float s1, float s2){
        s1 = Math.round(s1 * 1000);
        s1 = s1 / 1000;

        s2 = Math.round(s2 * 1000);
        s2 = s2/ 1000;

        if (s1 == s2){
        return "Skaičiai yra vienodi";
        }
        else{
            return "Skaičiai yra skirtingi";
        }
    }



}
