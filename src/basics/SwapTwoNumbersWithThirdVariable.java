package basics;

import java.util.Scanner;
public class SwapTwoNumbersWithThirdVariable {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("Swapped numbers are "+ a + " "+ b);
        sc.close();
    }
}
