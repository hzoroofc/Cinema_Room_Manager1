import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = 0;
        while (input != 0) {
            output = input > output ? input : output;
            input = scanner.nextInt();
        }
        System.out.println(output);
    }
}