import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int vMax = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;
        int[][] vArr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                vArr[i][j] = scanner.nextInt();
                if (vArr[i][j] > vMax) {
                    vMax = vArr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.printf("%d %d\n", maxRow, maxCol);

    }
}