import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int a;
        int b;
        long prod;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        prod = 1;
        for (; a < b; a++) {
            prod *= a;
        }
        System.out.println(prod);
    }
}