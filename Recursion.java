/**
 * Nicole Binette
 * 2/19/2018
 * A class full of recursive methods
*/
public class Recursion {
    /**
     * @param int x and y
     * @return int result
     */
    private static int recursiveMultiplication(int multiplicand, int multiplier) {
        if (multiplicand < 1 || multiplier < 1) {
            return 0;
        }
        if (multiplier == 1) {
            return multiplicand;
        }
        return multiplicand + recursiveMultiplication(multiplicand, multiplier - 1);
    }
    /**
     * @param int a[]
     * @param int value
     * @return true if value is found in a[]/false if value is not found in a[]
     */
    private static boolean isMember(int a[], int value) {
        if (a.length == 0) {
            return false;
        }
        if (a[0] == value) {
            return true;
        }
        int b[] = new int [a.length - 1];
        for (int index = 1; index < a.length; index++) {
            b[index - 1] = a[index];
        }
        return isMember(b, value);
    }
    private static void reverse(String s) {
        if (s == null) {
            return;
        }
        if (s.length() == 0) {
            System.out.println();
            return;
        }
        System.out.print()
        return reverse(s.)
            for (int index = s.length() - 1; index >= 0; index--) {
                System.out.println(s.charAt(index));
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(recursiveMultiplication(3,8));
        int a[] = {1,4,5,6,7,8,9,6};
        System.out.println(isMember(a,0));
        reverse("Hello");
    }

}