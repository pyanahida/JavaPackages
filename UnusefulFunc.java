package com.pyanahida.functions.unuseful;

public class UnusefulFunc {
    static private double EPSILON = 1E-9D;
    
    static public double SqrtPiExp(double x) {
        // \frac{\frac{47x}{72\sqrt{\frac{\pi}{8^x}}}}{32x}
        if ((-EPSILON < x) && (x < EPSILON) return Double.NaN;
        double a = 47D * x;
        double b = 72D * Math.sqrt(Math.PI / Math.pow(8D, x));
        double c = 32D * x;
        return (a / b) / c;
    }
}
