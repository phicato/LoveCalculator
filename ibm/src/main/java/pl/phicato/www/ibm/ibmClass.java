package pl.phicato.www.ibm;

public class ibmClass {
    public static void main(String[] args) {
        System.out.println("Your IBM is: " + yourIbm(66, 1.80));
    }
    public static double yourIbm(double yourweight, double yourheight){
        double weight = yourweight;
        double height = yourheight;
        double ibm = weight/(height*height);
        if (ibm>25){
            System.out.println("You are overweighted");
        }
        else if(ibm > 18.5){
            System.out.println("Your ibm is fine");
        }
        else{
            System.out.println("You are too skinny");
        }

        return ibm;
    }
}
