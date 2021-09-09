package com.company;

import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int x = sc.nextInt();

        System.out.println(Integer.toString(x, 2));
    }
}
