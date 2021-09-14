package com.company;

import java.util.Scanner;

public class Atbas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Text k zasifrovani:");
        String text = sc.nextLine();
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String word : letters) {
            if (text.contains(word)) {
                System.out.println(text.replace(word, "X"));
            }
        }
    }
}
