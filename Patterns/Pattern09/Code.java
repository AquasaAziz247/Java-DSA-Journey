class Solution {
    public void pattern9(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
