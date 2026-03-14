
public class NumberSquare {
    public static void main(String[] args) {
       int n=7;
       
        int maxVal = (int) Math.ceil(n / 2.0);

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int distFromEdge = Math.min(
                    Math.min(row, col),
                    Math.min(n - row + 1, n - col + 1)
                );
                System.out.print((maxVal + 1 - distFromEdge) + " ");
            }
            System.out.println();
        }
    }
}
