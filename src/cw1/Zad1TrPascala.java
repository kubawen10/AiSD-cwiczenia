package cw1;

public class Zad1TrPascala {
    public static void main(String[] args) {
        int depth = 8;

        int [][] triangle = generatePascalTriangle(depth);



        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] generatePascalTriangle(int depth){
        if (depth==0){
            return new int[][]{};
        }

        int triangle[][] = new int[depth][];
        triangle[0] = new int[]{1};

        for (int i = 1; i < depth; i++) {
            triangle[i] = nextPascalLine(triangle[i-1]);
        }

        return triangle;
    }

    public static int[] nextPascalLine(int [] prev){
        int [] nextLine = new int[prev.length+1];
        nextLine[0] = 1;
        for (int i = 1; i < prev.length; i++) {
            nextLine[i] = prev[i-1] + prev[i];
        }
        nextLine[prev.length] = 1;
        return nextLine;
    }
}
