package com.update;

/**
 * @author : liupu.
 * @date : 2019/01/01
 */
public class ArrayHelper {

    public static void printArr(int[] arrs) {
        int length = arrs.length;
        System.out.print("Array = [ ");
        for (int i = 0; i < length; i++) {
            if (i != length-1){
                System.out.print(arrs[i] + " , ");
            } else {
                System.out.println(arrs[i] + " ]");
            }
        }
    }

    public static void swap(int[] arrs, int x, int y) {
        int temp = arrs[x];
        arrs[x] = arrs[y];
        arrs[y] = temp;
    }

}
