package com.company;

import java.util.Scanner;

public class CVzor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int x = sc.nextInt();

        for (int i = x; i >= 1; --i) {
            System.out.println(x + " ");
        }
    }
}


