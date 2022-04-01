import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {3, 5, 0, 0, 1, 0, -1};
        // алгоритм который сместит ноли вправо
        Comparator<Integer> zeroLast = (num1, num2) -> {
            if (num1 == 0 && num2 != 0) {
                return 1;
            }
            if (num2 == 0 && num1 != 0) {
                return -1;
            }
            return 0;

        };
        System.out.println(Arrays.toString(Arrays.stream(numbers)
                .sorted(Comparator.nullsLast(zeroLast)).toArray()));

    }
}
