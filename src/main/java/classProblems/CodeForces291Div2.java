package classProblems;


import java.util.Scanner;

//Chewbacca and Number
public class CodeForces291Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i] > '4'){
                a[i] = (char)('9' - a[i] + '0');
            }
            if(a[0] == '0') a[0] = '9';
        }
        System.out.println(a);
    }
}
