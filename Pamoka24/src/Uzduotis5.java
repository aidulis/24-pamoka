
public class Uzduotis5 {
    public static void main(String[] args) {

        double rezultatas1 = grazintiSkaiciausModuli(-27.327);
        double rezultatas2 = grazintiSkaiciausModuli(258);
        double rezultatas3 = grazintiSkaiciausModuli(-147.25);
        double rezultatas4 = grazintiSkaiciausModuli(154.20);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
        System.out.println(rezultatas4);
    }

    public static double grazintiSkaiciausModuli(double x){
        if (x >= 0){
            return x;
        }
        else{
            return (x * (-1));
        }
    }
}
