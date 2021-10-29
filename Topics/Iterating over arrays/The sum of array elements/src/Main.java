import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        int[] vArray = new int[anzahl];
        int arrCnt = 0;
        while (arrCnt < anzahl) {
            vArray[arrCnt] = scanner.nextInt();
            arrCnt++;
        }
        System.out.println(Arrays.stream(vArray).sum());
    }
}