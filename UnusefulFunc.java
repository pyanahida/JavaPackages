package com.pyanahida.functions.unuseful;

public class UnusefulFunc {
    // Constant
    static private final double EPSILON = 1E-9D;

    // Private
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;  // To prevent division by zero
        return Math.abs(a) / Math.gcd(a, b) * Math.abs(b);
    }
    public static long sign(long x) {
        return (x>0L)?1L:((x<0L)?-1L:0L);
    }
    
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
    
    public static double ExpSinProductFunc(double) {
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
        return -1L;
    }
}
