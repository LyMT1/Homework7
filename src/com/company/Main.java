package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Bai1 bai1 = new Bai1();
        Bai2 bai2 = new Bai2();

        System.out.println("**----------------------------------------------------**");
        System.out.println("Nhập số 1 - Mảng số nguyên n phần tử");
        System.out.println("Nhập số 2 - Mảng chuỗi gồm n phần tử");
        System.out.println("\nNhập -1 để thoát chương trình");

        int number = -1;
        do {
            System.out.print("\nBạn muốn giải bài tập số: ");
            number = scanner.nextInt();
            if (number != -1) {
                switch (number) {
                    case 1:
                        bai1.giaiBT1();
                        break;
                    case 2:
                        bai2.giaiBT2();
                        break;

                    default:
                        System.out.println("Không có bài tập này. Hãy chọn từ 1 -> 2");
                        System.out.println("Nhập -1 để thoát chương trình");
                        break;
                }
            }
        } while (number >= 0);
    }
}