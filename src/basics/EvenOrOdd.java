package basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        num = Math.abs(num);// for even or add negative handling is not explicitly needed
        // using if-else statement

            if(num%2 == 0){
                System.out.println("Even");  // 0 is been considered as Even number in Maths
            }else{
                System.out.println("Odd");
            }

        // using teranry operator
        String res = num%2 == 0 ? "Even" : "Odd";
        System.out.println(res);
        sc.close();
    }
}
