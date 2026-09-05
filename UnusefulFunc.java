package com.pyanahida.functions.unuseful;

import java.math.BigInteger;

public class UnusefulFunc {
    // Constant
    static private final double EPSILON = 1E-9D;
    static private final double[] UNIQUE = {999D, 0D, 1D, 1.5D, 2D, 3D, -1D, -1.5D, -2D, -3D, -0.5D, 0.5D, 0.25D, -0.25D};

    // Private
    private static long sign(long x) {
        return (x>0L)?1L:((x<0L)?-1L:0L);
    }
    private static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    private static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;  // To prevent division by zero
        return Math.abs(a) / gcd(a, b) * Math.abs(b);
    }
    private static double cot(double x) {
        return 1.0 / Math.tan(x);
    }
    private static double csc(double x) {
        return 1.0 / Math.sin(x);
    }
    private static double sec(double x) {
        return 1.0 / Math.cos(x);
    }
    private static BigInteger factorialBig(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Main
    public static double SqrtPiExp(double x) {
        // y=\frac{\frac{47x}{72\sqrt{\frac{\pi}{8^x}}}}{32x}
        if ((-EPSILON < x) && (x < EPSILON)) return Double.NaN;
        double a = 47D * x;
        double b = 72D * Math.sqrt(Math.PI / Math.pow(8D, x));
        double c = 32D * x;
        return (a / b) / c;
    }
    
    public static double FracWithCos(double x) {
        // y=\frac{x}{1+\cos x}
        double c = Math.cos(x);
        if ((-EPSILON < (c+1)) && ((c+1) < EPSILON)) return Double.NaN;
        return x / (1D + c);
    }
    
    public static boolean XyFixedEq(int x, int y) {
        // y=xy
        return (x == 1) || (y == 0);
    }
    
    public static double ExpSinProductFunc(double x) {
        // y=e^{x}\sin(100xe)
        return Math.exp(x)*Math.sin(100D*x*Math.E);
    }
    
    public static double SinAsinForPow(double x) {
        // y=\sin^{2}(\arcsin(x^9))
        // equivalent to y=x^{18}, x\in[-1,1]
        if ((x >= -1D) && (x <= 1D)) {
            double result = 1D;
            for (int i = 0; i < 18; i++) {result *= x;}
            return result;
        }
        return Double.NaN;
    }

    public static long GcdLcmSgn(long x) {
        // WIP
        long a = ThreadLocalRandom.current().nextLong(1L, 100L);
        long b = ThreadLocalRandom.current().nextLong(1L, 100L);
        return gcd(x, a) * lcm(x, b) * sign(x);
    }

    public static double[] ManyANum(double x) {
        double[] result = new double[UNIQUE.length];
        for (int i = 0; i < UNIQUE.length; i++) {
            result[i] = UNIQUE[i] * x;
        }
        return result;
    }

    public static double SixTrigonometricFuunction(double x) {
        // The domain is too complicated, I'm too lazy to judge it
        return Math.sin(Math.cos(Math.tan(cot(csc(sec(x))))));
    }
}

// Planks
/*When coding on a mobile phone, the input method often obscures the bottom of the page. These blank lines allow me to see all the content.*/

    












*/
