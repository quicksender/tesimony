package while_loop;

public class SSquare {
    public static void main(String[] args) {
        int i = 0, j;
        int a = 10;
        while (i < a) {
            j = 0;
            while (j < a) {
                if (i == 0 || i == a - 1 || j == 0 || j == a - 1) {
                    System.out.print("  S");
                } else {
                    System.out.print("  S");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
