import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int vOutput = 0;
        int vInput = scanner.nextInt();
        int[] vInputArr = new int[vInput];
        for (int i = 0; i < vInput; i++) {
            vInputArr[i] = scanner.nextInt();
            vOutput += vInputArr[i] % 6 == 0 ? vInputArr[i] : 0;
        }
        System.out.println(vOutput);
    }
}