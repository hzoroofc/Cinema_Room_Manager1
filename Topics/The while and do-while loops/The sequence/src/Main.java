import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int seqCount = scanner.nextInt();
        int input;
        int maxDiv4 = 0;
        for (int i = 0; i < seqCount; i++) {
            input = scanner.nextInt();
            maxDiv4 = maxDiv4 > (input % 4 == 0 ? input : maxDiv4) ? maxDiv4 : (input % 4 == 0 ? input : maxDiv4);
        }
        System.out.println(maxDiv4);
    }
}