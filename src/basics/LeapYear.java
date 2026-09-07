package basics;

import java.util.Scanner;

public class LeapYear {

    /*
    leap year - divisible by 400 or 4 and not by 100
     */

    static String isLeap(int year){
        if(year > 0) {
            if (year % 400 == 0) {
                return "It is a Leap Year";
            } else if (year % 100 == 0) {
                return "It is not a leap year";
            } else if (year % 4 == 0) {
                return "It is a leap year";
            }else{
                return "It is not a leap year";
            }
        } else {
                return "Invalid year";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int givenYear = sc.nextInt();

        System.out.println(isLeap(givenYear));
        sc.close();
    }

}
