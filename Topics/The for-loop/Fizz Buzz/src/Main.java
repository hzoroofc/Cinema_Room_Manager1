import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int interval1 = scanner.nextInt();
        int interval2 = scanner.nextInt();

        for (; interval1 <= interval2; interval1++) {
            System.out.println(interval1 % 3 == 0 && interval1 % 5 == 0 ?
                            "FizzBuzz" : (interval1 % 5 == 0 ?
                            "Buzz" : (interval1 % 3 == 0 ? "Fizz" : interval1)
                    )
            );
        }
    }
}