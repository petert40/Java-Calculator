package org.example;

public class MagicCalculator extends Calculator{
    public static void main(String[] args) {
        MagicCalculator mc = new MagicCalculator();
        System.out.println(mc.squareRoot(4));
        System.out.println(mc.sin(2));
        System.out.println(mc.cos(2));
        System.out.println(mc.tan(1));
        System.out.println(mc.factorial(4));
    }
    public double squareRoot(int num){
        return Math.sqrt(num);
    }

    public double sin(int num){
        return Math.sin(num);
    }

    public double cos(int num){
        return Math.cos(num);
    }

    public double tan(int num){
        return Math.tan(num);
    }

    public long factorial(int num){
        long res = 1;
        for (int i = 2; i <=num ; i++) {
            res *= i;
        }
        return res;
    }





}
