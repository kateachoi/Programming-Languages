public class Proj2 {
    public static void main(String[] args) {
        int numberOfStates = 11, numberOfAlphabetSymbols = 4;
        int[][] table = new int[numberOfStates][numberOfAlphabetSymbols];

        for (int i = 0; i < numberOfStates; i++) {
            for (int j = 0; j < numberOfAlphabetSymbols; j++) {
                table[i][j] = -1;
            }
        }

        table[0][0] = 1;
        table[0][1] = 2;
        table[0][3] = 3;
        table[1][1] = 2;
        table[2][2] = 4;
        table[3][0] = 5;
        table[4][2] = 6;
        table[5][3] = 7;
        table[6][0] = 9;
        table[7][0] = 8;
        table[8][3] = 10;
        table[10][0] = 8;

        for (int i = 0; i < numberOfStates; i++){
            for (int j = 0; j < numberOfAlphabetSymbols; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
