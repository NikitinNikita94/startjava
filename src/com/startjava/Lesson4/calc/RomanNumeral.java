package com.startjava.Lesson4.calc;

enum RomanNumeral {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10),
    XL("XL", 40), L("L", 50), XC("XC", 90), C("C", 100);

    private String key;
    private int value;

    RomanNumeral(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public static int toInt(String key) {
        for (RomanNumeral num : RomanNumeral.values()) {
            if (num.getKey().equals(key)) {
                return num.getValue();
            }
        }
        return Integer.parseInt("");
    }

    public static String toRomeNumber(Integer x) {
        for (RomanNumeral num : RomanNumeral.values()) {
            if (num.getValue() == x) {
                return num.getKey();
            }
        }
        return "";
    }

    public static int toIntParse(String key) {
        for (RomanNumeral num : RomanNumeral.values()) {
            if (String.valueOf(num.getValue()).equals(key)) {
                return num.getValue();
            }
        }
        return 0;
    }
}
