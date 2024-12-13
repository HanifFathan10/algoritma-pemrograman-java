public class Array2D {
    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}};
        int total = 0;

        for (int row = 0; row < 4; row++) {
            for(int col = 0; col < 3; col++) {
                System.out.printf("%3d", array[row][col]);
                total += array[row][col];
            }
            System.out.println();
        }
        System.out.println("Total " + total);
    }
}
