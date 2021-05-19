package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {

    public void giaiBT2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = Integer.valueOf(scanner.nextLine());

        String strArr[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            strArr[i] = scanner.nextLine();
        }
        System.out.println("\nMảng vừa nhập là: " + Arrays.toString(strArr));

        //Đếm số lần "Java" xuất hiện trong mảng
        count(strArr);

        // Kiểm tra chuỗi có thuộc mảng
        System.out.println("Nhập vào chuỗi bất kì: ");
        String str = scanner.nextLine();
        getIndex(strArr, str);
    }

    void count(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("java")) {
                count++;
            }
        }
        System.out.println("\nSố lần ký tự Java xuất hiện trong mảng = " + count);
    }

    void getIndex(String[] strArr, String str) {
        boolean checkExit = false;
        int index = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                checkExit = true;
                index = i;
            }
        }
        if (checkExit) {
            System.out.println("Chuỗi " + str + " có index thứ " + index + " trong mảng " + Arrays.toString(strArr));
        } else {
            System.out.println("Chuỗi " + str + " không tồn tại trong mảng " + Arrays.toString(strArr));
        }
    }

}
