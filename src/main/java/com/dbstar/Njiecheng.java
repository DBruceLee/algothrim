package com.dbstar;

public class Njiecheng {
    public static void main(String[] args) {
        // (1000 / 5) + (200 / 5) + (40 / 5) + (8 / 5) + (1 / 5)
        System.out.println(new Njiecheng().trailingZeros_2(1000));
        System.out.println(8 / 5);
    }

    /**
     * 我的思路
     *
     * @param i
     * @return
     */
    public int trailingZeros(int i) {
        int num = 0;

        while (i / 5 != 0) {
            num += i / 5;
            i = i / 5;
        }
        return num;
    }

    /**
     * 答案
     *
     * @param i
     * @return
     */
    public int trailingZeros_2(int i) {
        int num = 0;

        while ((i /= 5) > 0) {
            num += i;
        }
        return num;
    }
}
