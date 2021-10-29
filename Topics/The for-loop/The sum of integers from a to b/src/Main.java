import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 22;
        int c = a;
        for (; b >= a; a++){
            c += a;
        }
        System.out.println(c);
    }
}
