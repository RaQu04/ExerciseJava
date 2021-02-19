package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String a = "ABABAababa";
        System.out.println(convert(a));

    }

    public static int convert(String value) {
        int resultUpper = 0;
        int resultLower = 0;

        char[] tabUpperCase = createTabUpperCase(value);
        char[] tabLowerCase = createTabLowerCase(value);

        for (char c : tabUpperCase) {
            resultUpper = resultUpper + ABS(c);
        }
        for (char c : tabLowerCase) {
            resultLower = resultLower + ABS(c);
        }

        if (resultLower == 0) {
            return -1;
        }
        double result = (double) resultUpper / (double) resultLower;

        return (int) Math.round(result);
    }

    private static char[] createTabLowerCase(String value) {
        Pattern pattern = Pattern.compile("[a-z]");
        char[] tablica = getChars(value, pattern);
        System.out.println("Tablica małych liter ");
        System.out.println(tablica);
        return tablica;
    }

    private static char[] createTabUpperCase(String value) {
        Pattern pattern = Pattern.compile("[A-Z]");
        char[] tablica = getChars(value, pattern);
        System.out.println("Tablica dużych liter: ");
        System.out.println(tablica);
        return tablica;
    }

    private static char[] getChars(String value, Pattern pattern) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            if (pattern.matcher(String.valueOf(value.charAt(i))).matches()) {
                result.append(value.charAt(i));
            }
        }

        char[] tablica = new char[result.length()];
        for (int i = 0; i < result.length(); i++) {
            tablica[i] = result.charAt(i);
        }
        return tablica;
    }

    public static int ABS(char ch) {
        return ch;
    }
}
