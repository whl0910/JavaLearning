package com.leon.quicksort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/27.
 */
public class QuickSort {

    public static void main(String[] args) {
        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int a[], int low, int high){
        if (low > high){
            return;
        }
        int i = low;
        int j = high;
        int index = a[i];                           //用子表第一个元素做基准元素
        while (i < j){                              //从表两端分别向中间查询
            while (i < j && a[j] >= index){
                j--;
            }
            a[i] = a[j];                            //用比基准小的记录替换低位记录
            while (i < j && a[i] <= index){
                i++;
            }
            a[j] = a[i];                            //用比基准大的记录替换高位记录
        }
        a[i] = index;                               //将基准元素放回到a[i]
        quickSort(a, low, i-1);               //对低位子表进行递归排序
        quickSort(a, i + 1, high);             //对高位子表进行递归排序
    }
}
