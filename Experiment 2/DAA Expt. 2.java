/*
Aim : Code implement power function in O(logn) time complexity.
*/

class PowerCalculator {
    public static double power(double x, int y) {
        if (y == 0) {
            return 1.0;
        }

        if (y < 0) {
            return 1.0 / power(x, -y);
        }

        double temp = power(x, y / 2);

        if (y % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("3^4 = " + power(3, 4));
        System.out.println("2^-2 = " + power(2, -2));
        System.out.println("5^0 = " + power(5, 0));
    }
}