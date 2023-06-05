public class Uzduotis6 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArMetaiYraKeliamieji(1580);
        boolean rezultatas2 = patikrintiArMetaiYraKeliamieji(2011);
        boolean rezultatas3 = patikrintiArMetaiYraKeliamieji(2016);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
    }

    public static boolean patikrintiArMetaiYraKeliamieji(int metai) {
        if ((metai % 400 == 0) || ((metai % 4 == 0) && (metai % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }
}