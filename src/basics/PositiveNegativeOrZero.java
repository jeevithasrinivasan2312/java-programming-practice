package basics;

import java.util.Scanner;
public class PositiveNegativeOrZero {

    private static String predictValue(int num){
        if(num > 0){
            return "Positive";
        } else if (num <0) {
            return "Negative";
        }else {
            return "Zero";
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        String res = predictValue(number);
        System.out.println(res);

        sc.close();
    }
}
