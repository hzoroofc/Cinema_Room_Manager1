import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int vAnzahlInputs = scanner.nextInt();
        int[] vArray = new int[vAnzahlInputs];
        for (int i = 0; i < vAnzahlInputs; i++) {
            vArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(vArray).min().getAsInt());
    }
}