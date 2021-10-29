import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        int[] vArray = new int[anzahl];
        int[] vArrayAdjc = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            vArray[i] = scanner.nextInt();
            vArrayAdjc[i] = i >= 1 ? vArray[i] * vArray[i - 1] : 0;
        }
        System.out.println(Arrays.stream(vArrayAdjc).max().getAsInt());
    }
}