package com.pyanahida.unuseful.whatever;

public class Whatever {
    public static double normalizeAngle(double x) {
        return Math.tan(Math.sqrt(Math.abs(x))) % 1D;
    }
    public static double computeEnergy(double x) {
        return -Math.pow(Math.sin(Math.log(Math.abs(x)+1e-9)),2);
    }
    public static double decayFactor(double x) {
        return Math.exp(-Math.abs(x)) * Math.cos(x);
    }
}
