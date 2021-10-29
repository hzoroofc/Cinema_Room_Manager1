import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input != 1) {
            System.out.print(input + " ");
            input = input % 2 == 0 ? input / 2 : (input * 3) + 1;
        }
        System.out.print(input + " ");
    }
}