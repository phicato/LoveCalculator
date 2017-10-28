package pl.phicato.www.javapractice;

public class myClass {

    public static void main(String[] args) {
        int change = getMilk(2,4, 60);
        System.out.println("Your change is: " + change);
    }
    public static int getMilk(int milkQuantity,int breadQuantity, int startingMoney){
        int MilkPrice = 12;
        int BreadPrice = 8;
        int shoppingBasket = MilkPrice * milkQuantity + BreadPrice * breadQuantity;

        System.out.println("Shopping cost: " + shoppingBasket);
        return startingMoney - shoppingBasket;
    }

}
