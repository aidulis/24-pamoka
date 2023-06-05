public class Uzduotis2 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArPelningasVerslas(1679.25, 2631.25);
        boolean rezultatas2 = patikrintiArPelningasVerslas(2300.25, 2300.25);
        boolean rezultatas3 = patikrintiArPelningasVerslas(1325.25, 1131.25);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
    }

    public static boolean patikrintiArPelningasVerslas(double islaidos, double pajamos){
        if(pajamos > islaidos){
            return true;
        }
        else{
            return false;
        }
    }
}
