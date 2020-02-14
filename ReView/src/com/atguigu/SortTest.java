package com.atguigu;

public class SortTest {
    public static void main(String[] args) {
        int[] sort = sort();
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
        System.out.println();
        int[] sort2 = sort2();
        for (int i = 0; i < sort2.length; i++) {
            System.out.print(sort2[i] + " ");
        }

    }

    public static int[] sort() {
        int[] a = new int[]{1, 3, 8, 15, 9, 55, 2};
        int temp = 0;
// 外层循环，它决定一共走几趟
// 内层循环，它决定每趟走一次
//如果后一个大于前一个
//换位
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printEach(a,i);
        }
        return a;

    }

    public static int[] sort2(){
        int[] a = new int[]{1, 3, 8, 15, 9, 55, 2};
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            printEach(a,i);
        }
        return a;
    }

    private static void printEach(int[] a,int i) {
        System.out.print("第"+(i+1)+"次遍历:" );
        for (int a1 : a) {
            System.out.print(a1+" ");
        }
        System.out.println();
    }
}




/*
label:  for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    continue label;
                 }
                    System.out.print(j);
                }
                System.out.println();
            }
        */



