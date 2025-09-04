package cognizantPrep.integramindsCTS_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month:");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Season:Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Season:Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Season:Autumn");
        } else {
            System.out.println("Season:Winter");
        }

        sc.close();
    }
}