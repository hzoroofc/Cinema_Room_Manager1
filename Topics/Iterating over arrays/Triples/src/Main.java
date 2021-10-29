import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        int[] vArray = new int[anzahl];
        int zaehler = 0;
        final int num = 2;
        for (int i = 0; i < anzahl; i++) {
            vArray[i] = scanner.nextInt();
            if (i >= num) {
                zaehler += vArray[i] == vArray[i - 1] + 1 && vArray[i] == vArray[i - 2] + 2 ? 1 : 0;
            }
        }
        System.out.println(zaehler);
    }
}
