class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int dimension = 3;
        int[][][] vArray = new int[dimension][dimension][dimension];
        int index = 0;
        for (int i = 0; i < dimension; i++) {
            index = 0;
            for (int j = 0; j < dimension; j++) {
                for (int k = 0; k < dimension; k++) {
                    vArray[i][j][k] = index++;
                }
            }

        }
        return vArray;
    }
}
