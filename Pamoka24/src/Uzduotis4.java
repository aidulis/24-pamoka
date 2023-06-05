public class Uzduotis4 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArGaliButiKvadratas(12.5, 12.5, 12.5, 12.5);
        boolean rezultatas2 = patikrintiArGaliButiKvadratas(1,1, 1, 1);
        boolean rezultatas3 = patikrintiArGaliButiKvadratas(13.4, 13.4, 13.34, 13.24);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
    }

    public static boolean patikrintiArGaliButiKvadratas(double a, double b, double c, double d){
        if (a == b && a == c && a == d && c == d && b == c && b == d){
            return true;
        }
        else{
            return false;
        }
    }
}
