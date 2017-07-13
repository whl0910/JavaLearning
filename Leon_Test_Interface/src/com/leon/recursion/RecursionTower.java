package com.leon.recursion;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/26.
 */
public class RecursionTower {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆盘的个数");
        int num = scanner.nextInt();
        //hanoi(num, 'x', 'y', 'z');
        hanoi2(num, 'x', 'y', 'z');
    }

    /**
     * 汉诺塔的递归算法 不相邻的也可以放
     * @param n 总共有多少个圆盘
     * @param x 起始柱
     * @param y 辅助
     * @param z 目的柱
     */
    private static void hanoi(int n, char x, char y, char z){
        if (n == 1){
            move(x, 1 , z);
        }
        else {
            hanoi(n-1, x, z, y);             //将前n-1个从x移到y z作为辅助
            move(x, n, z);                   //将编号为n的圆盘从x移到z
            hanoi(n-1, y, x, z);             //再将前n-1个从y移到z x作为辅助
        }
    }
    
    /**
     * 汉诺塔的递归算法 相邻的才可以放
     * @param n 总共有多少个圆盘
     * @param x 起始柱
     * @param y 辅助
     * @param z 目的柱
     */
    private  static  void hanoi2(int n, char x, char y, char z){
        if (n == 1){
            move(x, 1, y);
            move(y, 1, z);
        }
        else {
            hanoi2(n-1, x, y ,z);               //将n-1个号圆盘从x到z y做辅盘?
            move(x, n, y);                      //将n号圆盘从x移到y
            hanoi2(n-1, z, y, x);               //将n-1个圆盘从z到x y做辅盘?
            move(y, n, z);                      //将n号圆盘从y移到z
            hanoi2(n-1, x, y, z);               //将n-1个从x到z y辅助
        }
    }

    private static void move(char x, int n, char z){
        System.out.println("第" + (++count) + "移动" + n + "号圆盘" + x + "-------->" + z);
    }
}
