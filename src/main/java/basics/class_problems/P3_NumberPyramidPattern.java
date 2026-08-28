public class P1_NumberPyramidPattern {

    public static void main(String[] args) {
        printNumberPyramid(4);
    }

    static void printNumberPyramid(int n) {
               for (int row = 1; row <= n; row++) {

           
            for (int count = 1; count <= row; count++) {
                System.out.print(row + " ");
            }

                       System.out.println();
        }
    }
}