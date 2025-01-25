import java.util.*;

public class Calci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "yes";
        while (ans.equals("yes")){
            System.out.print("Enter First Number : ");
            float num1 = sc.nextFloat();
            System.out.print("Enter The Operator : \n1) Addition\n2) Subtraction\n3) Multiply\n4) Division\n5) Remainder\n6) Square Root ");
            int operator = sc.nextInt();
            float num2;
            switch(operator){
                case 1: 
                    System.out.print("Enter Second Number : ");
                    num2 = sc.nextFloat();
                    System.out.println(num1 + num2);
                    break;
                
                case 2:
                    System.out.print("Enter Second Number : ");
                    num2 = sc.nextFloat();    
                    System.out.println((num1 > num2) ? num1 - num2 : num2 - num1);
                    break;

                case 3:
                    System.out.print("Enter Second Number : ");
                    num2 = sc.nextFloat();
                    System.out.println(num1 * num2);
                    break;

                case 4: 
                    System.out.print("Enter Second Number : ");
                    num2 = sc.nextFloat();
                    if (num2 != 0){
                        System.out.println(num1 / num2);
                        break;
                    } else {
                        System.out.println("Cant be divided by zero!");
                        break;
                    }

                case 5:
                    System.out.print("Enter Second Number : ");
                    num2 = sc.nextFloat();
                    System.out.print((num2 != 0) ? num1 % num2 : "Cant divide with zero!");
                    break;

                case 6:
                    System.out.println(Math.sqrt(num1));
                    
            }
            
            System.out.print("Do you want to do more calculations?(yes/no) : ");
            ans = sc.next();

        }
        sc.close();
    }
}