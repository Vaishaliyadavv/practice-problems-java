package classProblems;

import java.util.Scanner;


//codeforces : #898 DIV4 SHORTSORT

public class SortABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (isSortable(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isSortable(String s) {
        if (s.charAt(0) == 'a') return true;
        if (s.charAt(1) == 'b') return true;
        return s.charAt(2) == 'c';
    }
}
