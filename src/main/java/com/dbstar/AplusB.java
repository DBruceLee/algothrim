package com.dbstar;

/**
 * 加法器原理
 */
public class AplusB {

    public static void main(String[] args) {
        System.out.println(new AplusB().plus(1, 2));
    }


    public int plus(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry == 0) {
            return sum;
        }
        return plus(sum, carry);
    }
}
