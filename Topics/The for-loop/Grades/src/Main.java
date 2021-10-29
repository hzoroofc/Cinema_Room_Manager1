import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        final int D = 2;
        final int C = 3;
        final int B = 4;
        final int A = 5;
        int Dcnt = 0;
        int Ccnt = 0;
        int Bcnt = 0;
        int Acnt = 0;
        int vOutput = 0;
        int vInput = scanner.nextInt();
        int[] vInputArr = new int[vInput];
        for (int i = 0; i < vInput; i++) {
            vInputArr[i] = scanner.nextInt();
            if (vInputArr[i] == D) {
                Dcnt++;
            }
            if (vInputArr[i] == C) {
                Ccnt++;
            }
            if (vInputArr[i] == B) {
                Bcnt++;
            }
            if (vInputArr[i] == A) {
                Acnt++;
            }

        }
        System.out.println(Dcnt + " " + Ccnt + " " + Bcnt + " " + Acnt);
    }
}