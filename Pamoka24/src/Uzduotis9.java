public class Uzduotis9 {
    public static void main(String[] args) {

        String rezultatas1 = isvestiKoksSkaicius(-1500000);
        String rezultatas2 = isvestiKoksSkaicius(-500);
        String rezultatas3 = isvestiKoksSkaicius(0);
        String rezultatas4 = isvestiKoksSkaicius(500000);
        String rezultatas5 = isvestiKoksSkaicius(1750000);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
        System.out.println(rezultatas4);
        System.out.println(rezultatas5);
    }
    static public String isvestiKoksSkaicius(int x){
        if(x < -1000000){
            return "didelis neigiamas";
        }
        else if(x < 0 && x > -1000){
            return "neigiamas";
        }
        else if (x == 0){
            return "nulis";
        }
        else if (x > 0 && x < 1000000){
            return "teigiamas";
        }
        else if (x > 1000000){
            return "didelis teigiamas";
        }
        else{
            return "didelis skaicius";
        }
    }
}
