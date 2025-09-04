package cognizantPrep.integramindsCTS_1;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int d4 = sc.nextInt();

        char ch1 = (char)d1;
        char ch2 = (char)d2;
        char ch3 = (char)d3;
        char ch4 = (char)d4;


        System.out.println(d1 + "-" + ch1);
        System.out.println(d2 + "-" + ch2);
        System.out.println(d3 + "-" + ch3);
        System.out.println(d4 + "-" + ch4);
    }
}
