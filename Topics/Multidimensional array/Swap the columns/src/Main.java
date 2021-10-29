import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] vArr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                vArr[i][j] = scanner.nextInt();
            }
        }

        int[] swapper = new int[3];
        swapper[0] = scanner.nextInt();//col1
        swapper[1] = scanner.nextInt();//col2
        swapper[2] = 0;//helper

        for (int i = 0; i < rows; i++) {
            swapper[2] = vArr[i][swapper[0]];
            vArr[i][swapper[0]] = vArr[i][swapper[1]];
            vArr[i][swapper[1]] = swapper[2];
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(vArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}