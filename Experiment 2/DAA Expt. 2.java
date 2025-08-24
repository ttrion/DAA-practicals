class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return calculatePower(x, n);
    }
    
    private double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        double result = calculatePower(base, exponent / 2); 
        if (exponent % 2 == 0) {
            return result * result;
        } else {
            return base * result * result;
        }
    }
}
