public class Uzduotis7 {
    public static void main(String[] args) {

        int rezultatas1 = patikrintiKiekDienuTuriMenesis(2004, 2);
        int rezultatas2 = patikrintiKiekDienuTuriMenesis(1999, 4);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
    }

    public static int patikrintiKiekDienuTuriMenesis(int metai, int menesis){
        if(menesis == 1){
            return 31;
        }
        else if (menesis == 2){
            if(((metai % 400 == 0) || ((metai % 4 == 0) && (metai % 100 != 0))) ){
                return 29;
            }
            else{
                return 28;
            }
        }
        else if (menesis == 3){
            return 31;
        }
        else if (menesis == 4){
            return 30;
        }
        else if (menesis == 5){
            return 31;
        }
        else if (menesis == 6){
            return 30;
        }
        else if(menesis == 7){
            return 31;
        }
        else if (menesis == 8){
            return 31;
        }
        else if (menesis == 9){
            return 30;
        }
        else if (menesis == 10){
            return 31;
        }
        else if (menesis == 11){
            return 30;
        }
        else if (menesis == 12){
            return 31;
        }
        else{
            return 0;
        }
    }
    }


