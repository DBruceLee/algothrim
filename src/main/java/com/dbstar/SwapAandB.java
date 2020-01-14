package com.dbstar;

/**
 * 交换A和B的值，不引入第三个变量
 */
public class SwapAandB {

    public static void main(String[] args) {
        new SwapAandB().swapAandB(3, 2);
    }
    public void swapAandB(int a, int b) {
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("a:" + a + " b:" + b);
    }
}
