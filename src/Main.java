import java.io.File;
import java.util.Scanner;

class MaxSumNonDivisibleBy3 {
    public static void main(String[] args) throws Exception {
        int sum = 0, minMod1 = Integer.MAX_VALUE, minMod2 = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(new File("data.txt"));

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt(), b = scanner.nextInt(), max = Math.max(a, b), min = Math.min(a, b);
            sum += max;
            int diff = max - min;
            if (diff % 3 == 1) minMod1 = Math.min(minMod1, diff);
            if (diff % 3 == 2) minMod2 = Math.min(minMod2, diff);
        }
        scanner.close();

        System.out.println(sum % 3 == 0 ? sum - Math.min(minMod1, minMod2) : sum);
    }
}
