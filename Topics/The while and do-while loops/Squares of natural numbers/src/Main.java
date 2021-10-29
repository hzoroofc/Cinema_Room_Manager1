import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = 1;
        int counter = 1;
        while (output <= input) {
            output = counter * counter;
            if(output <= input) {
                System.out.println(output);
            }
            counter++;
        }
    }
}