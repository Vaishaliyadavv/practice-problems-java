package cognizantPrep.integramindsCTS_2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of tickets:");
        int tickets = sc.nextInt();

        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
        System.out.println("Do you want refreshments:");
        char refreshments = sc.next().charAt(0);

        System.out.println("Do you want coupon code:");
        char coupon = sc.next().charAt(0);

        System.out.println("Enter the circle:");
        char circle = sc.next().charAt(0);

        double ticketPrice;
        if (circle == 'k' || circle == 'K') {
            ticketPrice = 75;
        } else if (circle == 'q' || circle == 'Q') {
            ticketPrice = 150;
        } else{
            System.out.println("Invalid input");
            return;
        }

        double totalCost = tickets * ticketPrice;

        if (tickets > 20) {
            totalCost = totalCost - (totalCost * 0.10);
        }

        if (coupon == 'y' || coupon == 'Y') {
            totalCost = totalCost - (totalCost * 0.02);
        }

        if (refreshments == 'y' || refreshments == 'Y') {
            totalCost = totalCost + (tickets * 50);
        }


        System.out.println(totalCost);
        sc.close();
    }
}
