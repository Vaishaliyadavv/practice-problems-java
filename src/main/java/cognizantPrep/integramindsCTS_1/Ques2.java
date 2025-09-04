package cognizantPrep.integramindsCTS_1;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of pizzas bought: ");
        int pizzas = sc.nextInt();

        System.out.println("Enter the no of puffs bought: ");
        int puffs = sc.nextInt();


         System.out.println("Enter the no of cool drinks bought: ");
        int coolDrinks = sc.nextInt();

        int totalPrice = (100*Math.abs(pizzas)) + (20*Math.abs(puffs)) + (10*Math.abs(coolDrinks));

        System.out.println("Bill Details");
        System.out.println("No of pizzas: "+ pizzas);
        System.out.println("No of puffs: "+ puffs);
        System.out.println("No of cooldrinks: "+ coolDrinks);
        System.out.println("Total pice="+ totalPrice);
        System.out.println("ENJOY THE SHOW!!!");

    }
}
