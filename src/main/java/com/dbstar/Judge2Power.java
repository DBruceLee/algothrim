package com.dbstar;

import java.util.Date;

/**
 * 判断一个数是否为2的整数次幂
 */
public class Judge2Power {
    public static void main(String[] args) {
        System.out.println(new Date().getTime());
//        System.out.println(new Judge2Power().judge2Power(Integer.MAX_VALUE));
        System.out.println(new Date().getTime());
//        System.out.println(new Judge2Power().judge2Power_2(Integer.MAX_VALUE));
        System.out.println(new Date().getTime());
        System.out.println(new Judge2Power().judge2Power_3(Integer.MAX_VALUE));
    }

    public boolean judge2Power(int num) {
        int temp = 1;
        while (temp <= num) {
            if (temp == num) {
                return true;
            }
            temp *= 2;
        }
        return false;
    }

    public boolean judge2Power_2(int num) {
        int temp = 1;
        while (temp <= num) {
            if (temp == num) {
                return true;
            }
            temp <<= 1;
        }
        return false;
    }

    public boolean judge2Power_3(int num) {
        return (num & (num - 1)) == 0;
    }
}
