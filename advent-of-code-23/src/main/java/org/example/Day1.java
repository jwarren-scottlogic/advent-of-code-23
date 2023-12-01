package org.example;

import java.util.List;

public class Day1 {

    public static int day1 (String inputString) {
        List<String> inputStringList =List.of(inputString.split("\n"));
        return inputStringList.stream().mapToInt(e -> numberFilter(e)).map(e -> correctNumberIdentifier(e)).sum();
    }

    private static int numberFilter(String inputStringEntry){
        return Integer.parseInt(inputStringEntry.toLowerCase().replaceAll("[a-z]", ""));
    }
    private static int correctNumberIdentifier(int number){
        String numberString = String.valueOf(number);
        System.out.println("////////////////////////"+numberString);
        if (numberString.length() == 1){
            return Integer.parseInt(numberString.repeat(2));
        }
        System.out.println(numberString.charAt(numberString.length()-1));
        String firstNumber = String.valueOf(numberString.charAt(0));
        String lastNumber = String.valueOf(numberString.charAt(numberString.length()-1));
        return Integer.parseInt(firstNumber+lastNumber);
    }

    public static void main(String[] args) {
        String inputString = "1abc2\npqr3stu8vwx\na1b2c3d4e5f\ntreb7uchet";
        System.out.println(day1(inputString));
    }
}