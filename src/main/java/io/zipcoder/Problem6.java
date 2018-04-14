package io.zipcoder;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.rotateLeft;

public class Problem6 {

    private String inputTime;

    public Problem6(){
    }

//    public String stringToSplit(String inputTime){
//        ArrayList<Integer> splittingTime = new ArrayList<Integer>();
//        String[] split = inputTime.split(" ");
//        if (String)
//    }

    public String convertMorningHours(int hour){
        String timeInMilitary = "";
        switch (hour){
            case 1: timeInMilitary = "Zero One";
            break;
            case 2: timeInMilitary = "Zero Two";
                break;
            case 3: timeInMilitary = "Zero Three";
                break;
            case 4: timeInMilitary = "Zero Four";
                break;
            case 5: timeInMilitary = "Zero Five";
                break;
            case 6: timeInMilitary = "Zero Six";
                break;
            case 7: timeInMilitary = "Zero Seven";
                break;
            case 8: timeInMilitary = "Zero Eight";
                break;
            case 9: timeInMilitary = "Zero Nine";
                break;
            case 10: timeInMilitary = "Ten";
                break;
            case 11: timeInMilitary = "Eleven";
                break;
            case 12: timeInMilitary = "Twelve";
                break;
        }
        return timeInMilitary;
    }

    public String convertNightHours(int hour){
        String timeInMilitary = "";
        switch (hour){
            case 1: timeInMilitary = "Thirteen";
                break;
            case 2: timeInMilitary = "Fourteen";
                break;
            case 3: timeInMilitary = "Fifteen";
                break;
            case 4: timeInMilitary = "Sixteen";
                break;
            case 5: timeInMilitary = "Seventeen";
                break;
            case 6: timeInMilitary = "Eighteen";
                break;
            case 7: timeInMilitary = "Nineteen";
                break;
            case 8: timeInMilitary = "Twenty";
                break;
            case 9: timeInMilitary = "Twenty One";
                break;
            case 10: timeInMilitary = "Twenty Two";
                break;
            case 11: timeInMilitary = "Twenty Three";
                break;
            case 12: timeInMilitary = "Zero Zero";
                break;
        }
        return timeInMilitary;
    }
}
