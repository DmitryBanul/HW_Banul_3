package com.itacademy.tasks;

public class task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = discriminant (a,b,c);
        if (!isPositive(d)) {
            System.out.println("d < 0: нет корней");
        } else {
            double x1 = (b*(-1)+Math.sqrt(d))/(2*a);
            double x2 = (b*(-1)-Math.sqrt(d))/(2*a);
            System.out.println("d > 0:");
            System.out.println("х1= "+x1);
            System.out.println("х2= "+x2);
            } if (isZero(d)) {
                double x = (b*(-1)+Math.sqrt(d))/(2*a);
                System.out.println("d = 0:");
                System.out.println("х=: "+x);
                }
    }
    public static boolean isPositive(long d) {
        return (d>0);
    }
    public static boolean isZero(long d) {
        return (d==0);
    }
    public static int discriminant (int a, int b, int c) {
        return (b*b-4*a*c);
    }
}
