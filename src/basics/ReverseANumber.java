package basics;

import java.util.Scanner;

public class ReverseANumber {

    static  int reverseNumber(int number){
        int res=0, i;
        number = Math.abs(number);
        while(number > 0){
            i = number%10;  // 456 , 6, 60
            res = (res*10)+ i;
            number = number/10;
        }

        return res;
    }

    static StringBuilder reverseNumberWithTrailingZeros(int number){
        String s = Integer.toString(number);
        if(s.charAt(0)=='-'){
            StringBuilder sb = new StringBuilder(s.substring(1,s.length()));
            sb.reverse();
            sb.insert(0, '-');
            return sb;
        }

        return new StringBuilder(s).reverse();
    }

    static StringBuffer reverseNumberUsingString(double number){
        String s = Double.toString(number);
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int  a = sc.nextInt();
        System.out.println(reverseNumberWithTrailingZeros(a));

    }
}
