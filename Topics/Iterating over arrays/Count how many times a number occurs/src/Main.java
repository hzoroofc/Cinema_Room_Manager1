import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int anzahl = scanner.nextInt();
        int[] vArray = new int[anzahl];
        int input;
        int count = 0;
        for (int i = 0; i < anzahl; i++) {
            vArray[i] = scanner.nextInt();
        }
        input = scanner.nextInt();
        for (int i = 0; i < vArray.length; i++) {
            count += vArray[i] == input ? 1 : 0;
        }
        System.out.println(count);
    }
}