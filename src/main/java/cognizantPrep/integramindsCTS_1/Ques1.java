package cognizantPrep.integramindsCTS_1;


import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int litres = sc.nextInt();

        System.out.println("Enter the distance covered");
        int distance = sc.nextInt();

        if(litres <= 0){
            System.out.println(litres + " is an invalid output");
        }  else if(distance<=0){
            System.out.println(distance + " is an invalid output");
        } else{

            double miles = distance*0.6214;
            double gallons = litres*0.2642;

            double mpg = miles / gallons;

            double litresPer100km = (litres/(double)distance)*100;

            System.out.println("Litres/100KM");
            System.out.printf("%.2f\n",litresPer100km);


            System.out.println("Miles/gallons");
            System.out.printf("%.2f\n",mpg);
        }

        sc.close();
    }
}
