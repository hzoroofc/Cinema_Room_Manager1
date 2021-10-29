import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();

        for (int i = 0; i < anzahl; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= anzahl - 1 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}