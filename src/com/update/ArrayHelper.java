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
}
