package io.zipcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.rotateLeft;

public class Problem6 {


    String[] stringsOfNums = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
            "Twenty One", "Twenty Two", "Twenty Three"};

    public Problem6() {
    }

    public String militaryTimeConverter(String input){
        String output = "";
        String hourMinute = "";
        if (input.contains("am")){
            hourMinute = input.replace("am", "");
        } else if (input.contains("pm")){
            hourMinute = input.replace("pm", "");
        }
        String [] hourMinArray = hourMinute.split(":");
        int [] hourMinIntegers = new int[2];
        hourMinIntegers[0] = Integer.parseInt(hourMinArray[0]);
        hourMinIntegers[1] = Integer.parseInt(hourMinArray[1]);

        if (input.contains("am")){
            output += morningConversionHour(hourMinIntegers[0]);
            output += minuteConversion(hourMinIntegers[1]);
        } else if (input.contains("pm")){
            output += nightConversionHour(hourMinIntegers[0]);
            output += minuteConversion(hourMinIntegers[1]);
        }
        return output;
    }

    public Map<Integer, String> populateMap() {
        Map<Integer, String> numAndStringValue = new HashMap<Integer, String>();
        for (int i = 0; i < stringsOfNums.length; i++) {
            numAndStringValue.put(i, stringsOfNums[i]);
        }
        numAndStringValue.put(30, "Thirty");
        numAndStringValue.put(40, "Forty");
        numAndStringValue.put(50, "Fifty");
        return numAndStringValue;
    }

    public String morningConversionHour(int hour) {
        Map<Integer, String> map = populateMap();
        String result = "";
        if (hour < 10) {
            result += "Zero ";
            result += map.get(hour);
        } else if (hour == 12) {
            result += "Zero Zero";
        } else {
            result += map.get(hour);
        }
        result += " Hundred and ";
        return result;
    }

    public String nightConversionHour(int hour) {
        Map<Integer, String> map = populateMap();
        String result = "";
        if (hour == 12) {
            result += map.get(hour);
        } else {
            result += map.get(hour + 12);
        }
        result += " Hundred and ";
        return result;
    }

    public String minuteConversion(int minute) {
        Map<Integer, String> map = populateMap();
        String result = "";
        if (minute < 24) {
            if (minute < 10) {
                result += "Zero ";
            }
            result += map.get(minute);
            result += " Hours";
        } else {
            int temp = minute / 10;
            temp *= 10;
            int modulus = minute % 10;
            result += map.get(temp);
            if (modulus != 0) {
                result += map.get(modulus);
            }
            result += " Hours";
        }
        return result;
    }
}
