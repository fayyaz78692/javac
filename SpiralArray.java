public class SpiralArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16},{17,18,19,20,21}};
        int top = 0;
        int bottom = array.length - 1;
        int left = 0;
        int right = array[0].length - 1;

        while (top <= bottom && left <= right) {
             for (int i = left; i <= right; i++) {
                System.out.print(array[top][i] + " ");
            }
            top++;
              for (int i = top; i <= bottom; i++) {
                System.out.print(array[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(array[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(array[i][left] + " ");
                }
                left++;
            }
        }
    }
}