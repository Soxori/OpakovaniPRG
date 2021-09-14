package com.company;

import java.util.Scanner;

public class Atbas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Text k zasifrovani:");
        String text = sc.nextLine();
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char word : letters) {
            if (text.contains(word)) {
                System.out.println(text.replaceAll(word, "X"));
            }
        }
    }
}
