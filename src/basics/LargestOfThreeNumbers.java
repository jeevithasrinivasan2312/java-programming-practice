package basics;

public class LargestOfThreeNumbers {

        private static int findLargest(int num1, int num2, int num3){
            int x = 0;
            if(num1 >= num2 && num1 >= num3){
                x = num1;
            } else if (num2 >= num3 && num2 >= num1) {
                x = num2;
            }else{
                x= num3;
            }
            return x;
        }

        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the numbers");
//
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c= sc.nextInt();

            System.out.println("The Largest number is "+ findLargest(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE));
//            sc.close();
        }
    }
