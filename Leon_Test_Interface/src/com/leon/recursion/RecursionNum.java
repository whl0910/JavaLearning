package com.leon.recursion;

/**
 * Created by Administrator on 2017/6/26.
 */
public class RecursionNum {

    public static void main(String[] args) {
        multiplication(9);
    }

    private  static void multiplication(int i){
        if (i == 1){
            System.out.println("1*1=1");
        }else {
            multiplication(i-1);
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + j*i + "   ");
            }
            System.out.println();
        }
    }
}
