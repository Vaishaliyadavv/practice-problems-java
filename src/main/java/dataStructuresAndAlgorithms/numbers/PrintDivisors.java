package dataStructuresAndAlgorithms.numbers;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {
    public static List<Integer> sumOfDivisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}
