/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rochelle.vowelchecker;

/**
 *
 * @author 27790
 */
public class VowelChecker {

    public static void main(String[] args) {
        try {
            String text = "typ bnn ";
            System.out.println("Original text: " + text);
            checkVowels(text);
            System.out.println("Contains vowels");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                containsVowels = true;
            }
        }
        if (!containsVowels) {
            throw new NoVowelsException("String does not contain any vowels");
        }
    }
}
