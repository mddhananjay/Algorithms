public class GCD {
    public static void main(String[] args) {
        int x=100;
        int y=90;

        while (x%y != 0){
            if (x>y){
                x= x%y;
            }else{
                y= y%x;
            }
        }

        System.out.println(x);
    }

    public static long GCD(long x, long y) {
        if (x == y) {
            return x;
        } else if ((x & 1) == 0 && (y & 1) == 0) { // x and y are even.
            return GCD(x >>> 1, y >>> 1) << 1;
        } else if ((x & 1) == 0 && (y & 1) != 0) { // x is even, y is odd.
            return GCD(x >>> 1, y);
        } else if ((x & 1) != 0 && (y & 1) == 0) { // x is odd, y is even.
            return GCD(x, y >>> 1);
        } else if (x > y) { // Both x and y are odd, and x > y.
            return GCD(x - y, y);
        }
            return GCD(x, y - x); // Both x and y are odd, and x <= y.

    }
}

/*    int gcd_algorithm(int x, int y)
    {
        if (y == 0) {
            return x;
        } else if (x >= y && y > 0) {
            return gcd_algorithm(y, (x % y));
        }
    }*/
