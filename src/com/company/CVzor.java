package com.company;

import java.util.Scanner;

public class CVzor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        String x = sc.nextLine();

        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.substring(0, x.length() - i));
        }
    }
}
