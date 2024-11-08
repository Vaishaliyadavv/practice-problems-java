package dataStructuresAndAlgorithms.recursion;

public class RecProblems {
    public static void printN(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        printN(i + 1, n);
    }

    public static void printNto1(int i, int n) {
        if (i > n) return;
        printNto1(i + 1, n);
        System.out.println(i);
    }

    public static void printSum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        printSum(i - 1, sum + i);
    }

    public static int printSumFunctional(int n) {
        if (n == 0) return 0;
        return n + printSumFunctional(n - 1);
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
//        printN(1,10);
//        printNto1(1,5);
        //System.out.println(printSumFunctional(3));
        System.out.println(factorial(5));
    }


}
