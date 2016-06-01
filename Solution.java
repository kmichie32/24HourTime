package com.company;

import java.util.Scanner;

public class Solution {

    public String[] timeAdjuster(String[] timeHolder){
        if(timeHolder[2].substring(2).equalsIgnoreCase("AM")){
            if(Integer.parseInt(timeHolder[0]) == 12){
                timeHolder[0] = "00";
                timeHolder[2]= timeHolder[2].substring(0,2);
            }
            else{
                timeHolder[2]= timeHolder[2].substring(0,2);
            }
        }
        if(timeHolder[2].substring(2).equalsIgnoreCase("PM")){
            if(Integer.parseInt(timeHolder[0]) == 12){
                timeHolder[2]= timeHolder[2].substring(0,2);
            }
            else{
                timeHolder[2]= timeHolder[2].substring(0,2);
                int valueHolder = Integer.parseInt(timeHolder[0]) + 12;
                String stringValue = valueHolder + "";
                timeHolder[0] = stringValue;
            }
        }
        return timeHolder;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String timeStamp = scanner.nextLine();
        String[] timeHolder = new String[3];
        int counter = 0;
        for(String pieces : timeStamp.split(":")){
            timeHolder[counter] = pieces;
            counter++;
        }

        String[] adjustedTimeHolder = solution.timeAdjuster(timeHolder);

        for(int i = 0; i < adjustedTimeHolder.length; i++) {
            if (i < 2) {
                System.out.print(adjustedTimeHolder[i] + ":");
            } else {
                System.out.print(adjustedTimeHolder[i]);
            }
        }

    }
}
