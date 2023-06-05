public class Uzduotis3 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArGalimaSudarytiTrikampi(25, 14, 10);
        boolean rezultatas2 = patikrintiArGalimaSudarytiTrikampi(1, 1, 1);
        boolean rezultatas3 = patikrintiArGalimaSudarytiTrikampi(12, 5, 7);
        boolean rezultatas4 = patikrintiArGalimaSudarytiTrikampi(123.451, 146.541, 100.2257);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
        System.out.println(rezultatas4);
    }

    public static boolean patikrintiArGalimaSudarytiTrikampi(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }
        else{
            return false;
        }
    }
}
