import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner myObj = new Scanner(System.in);
        String sample = myObj.nextLine();
        String[] sampleArr;
        if (sample.contains("+")) {
            sampleArr = sample.split("[+]");
            if(sampleArr.length > 2)
            {
                throw new IOException();
            }
            System.out.println("Output");
            if(sample.contains("I") || sample.contains("V") || sample.contains("X")) {
                System.out.println(converterToRoman.convertToArabic(converterToRoman.convertToRoman(sampleArr[0]) + converterToRoman.convertToRoman(sampleArr[1])));
            }
            else
            {
                System.out.println(Integer.parseInt(sampleArr[0]) + Integer.parseInt(sampleArr[1]));
            }
        }
        else if (sample.contains("-")) {
            sampleArr = sample.split("[-]");
            if(sampleArr.length > 2)
            {
                throw new IOException();
            }
            System.out.println("Output:");
            if(sample.contains("I") || sample.contains("V") || sample.contains("X")) {
                if(converterToRoman.convertToRoman(sampleArr[0]) < converterToRoman.convertToRoman(sampleArr[1]))
                {
                    throw new IOException();
                }
                System.out.println(converterToRoman.convertToArabic(converterToRoman.convertToRoman(sampleArr[0]) - converterToRoman.convertToRoman(sampleArr[1])));
            }
            else
            {
                System.out.println(Integer.parseInt(sampleArr[0]) - Integer.parseInt(sampleArr[1]));
            }
        }
        else if (sample.contains("*")) {
            sampleArr = sample.split("[*]");
            if(sampleArr.length > 2)
            {
                throw new IOException();
            }
            System.out.println("Output:");
            if(sample.contains("I") || sample.contains("V") || sample.contains("X")) {
                System.out.println(converterToRoman.convertToArabic(converterToRoman.convertToRoman(sampleArr[0]) * converterToRoman.convertToRoman(sampleArr[1])));
            }
            else
            {
                System.out.println(Integer.parseInt(sampleArr[0]) * Integer.parseInt(sampleArr[1]));
            }
        }
        else if (sample.contains("/")) {
            sampleArr = sample.split("[/]");
            if(sampleArr.length > 2)
            {
                throw new IOException();
            }
            System.out.println("Output:");
            if(sample.contains("I") || sample.contains("V") || sample.contains("X")) {
                System.out.println(converterToRoman.convertToArabic(converterToRoman.convertToRoman(sampleArr[0]) / converterToRoman.convertToRoman(sampleArr[1])));
            }
            else
            {
                System.out.println(Integer.parseInt(sampleArr[0]) / Integer.parseInt(sampleArr[1]));
            }
        }
        else
        {
            throw new IOException();
        }
    }
}
