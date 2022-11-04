import java.io.IOException;

public class converterToRoman {
    public static int convertToRoman(String s) throws IOException {
        int number = 0;
        if (s.equals("I")) {
            number = 1;
        } else if (s.equals("II")) {
            number = 2;
        } else if (s.equals("III")) {
            number = 3;
        } else if (s.equals("IV")) {
            number = 4;
        } else if (s.equals("V")) {
            number = 5;
        } else if (s.equals("VI")) {
            number = 6;
        } else if (s.equals("VII")) {
            number = 7;
        } else if (s.equals("VIII")) {
            number = 8;
        } else if (s.equals("IX")) {
            number = 9;
        } else if (s.equals("X")) {
            number = 10;
        } else {
            throw new IOException();
        }
        return number;
    }

    public static String convertToArabic(int n) throws IOException {
        int dec = 0;
        int ec = 0;
        String decS = "";
        String ecS = "";
        String romanNumber = "";
        if (n < 1) {
            throw new IOException();
        }
        ec = n % 10;
        dec = (n / 10) * 10;
        if (ec == 1) {
            ecS = "I";
        }
        if (ec == 2) {
            ecS = "II";
        }
        if (ec == 3) {
            ecS = "III";
        }
        if (ec == 4) {
            ecS = "IV";
        }
        if (ec == 5) {
            ecS = "V";
        }
        if (ec == 6) {
            ecS = "VI";
        }
        if (ec == 7) {
            ecS = "VII";
        }
        if (ec == 7) {
            ecS = "VII";
        }
        if (ec == 8) {
            ecS = "VIII";
        }
        if (ec == 9) {
            ecS = "IX";
        }
        if (ec == 10) {
            ecS = "X";
        }
        if (ec == 50) {
            ecS = "L";
        }
        if (ec == 100) {
            ecS = "C";
        }
        if (dec == 10) {
            decS = "X";
        }
        if (dec == 20) {
            decS = "XX";
        }
        if (dec == 30) {
            decS = "XXX";
        }
        if (dec == 40) {
            decS = "XL";
        }
        if (dec == 50) {
            decS = "L";
        }
        if (dec == 60) {
            decS = "LX";
        }
        if (dec == 70) {
            decS = "LXX";
        }
        if (dec == 80) {
            decS = "LXXX";
        }
        if (dec == 90) {
            decS = "XC";
        }
        if (dec == 100) {
            decS = "C";
        }
        romanNumber = decS + ecS;
        decS = "";
        ecS = "";
        return romanNumber;
    }
}
