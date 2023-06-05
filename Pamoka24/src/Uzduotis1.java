public class Uzduotis1 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArDalijasiBeLiekanos(25, 6, 5);
        boolean rezultatas2 = patikrintiArDalijasiBeLiekanos(-100, 10, -20);
        boolean rezultatas3 = patikrintiArDalijasiBeLiekanos(140, 7, 2);
        boolean rezultatas4 = patikrintiArDalijasiBeLiekanos(12, 4, 5);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
        System.out.println(rezultatas4);
    }

    public static boolean patikrintiArDalijasiBeLiekanos(int skaicius, int daliklis1, int daliklis2){
        if(skaicius % daliklis1 == 0 && skaicius % daliklis2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
