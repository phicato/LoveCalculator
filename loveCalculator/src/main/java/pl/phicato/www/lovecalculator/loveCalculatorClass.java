package pl.phicato.www.lovecalculator;

import java.util.Random;

public class loveCalculatorClass {
    public static void main(String[] args) {
        System.out.println(coupleNames("Anna", "Adam"));
        System.out.println("Your love score is: " + ifYouHadMyLove());
    }

    public static int ifYouHadMyLove(){
        Random randomNumber = new Random();
        int loveScore = randomNumber.nextInt(100);

        if (loveScore>70){
            System.out.println("You shall be happy");
        }
        else if (loveScore>45){
            System.out.println("Maybe you can make it");
        }
        else{
            System.out.println("It's not going to work");
        }
        return loveScore;
    }
    public static String coupleNames(String girlName, String menName){
        return girlName + " and " + menName;
    }
}
