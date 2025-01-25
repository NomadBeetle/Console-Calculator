import java.util.*;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "yes";
        
        while (ans.equals("yes")) {
            System.out.print("Enter First Number: ");
            float num1 = sc.nextFloat();
            System.out.print("Enter The Operator: \n1) Addition\n2) Subtraction\n3) Multiply\n4) Division\n5) Remainder\n6) Square Root\n");
            int operator = sc.nextInt();
            
            float num2 = 0;
            if (operator != 6) {
                System.out.print("Enter Second Number: ");
                num2 = sc.nextFloat();
            }

            switch (operator) {
                case 1:
                    System.out.printf("Result: %.2f\n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("Result: %.2f\n", (num1 > num2) ? num1 - num2 : num2 - num1);
                    break;
                case 3:
                    System.out.printf("Result: %.2f\n", num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Result: %.2f\n", num1 / num2);
                    } else {
                        System.out.println("Can't divide by zero!");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        System.out.printf("Result: %.2f\n", num1 % num2);
                    } else {
                        System.out.println("Can't divide by zero!");
                    }
                    break;
                case 6:
                    System.out.printf("Result: %.2f\n", Math.sqrt(num1));
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
            
            System.out.print("Do you want to do more calculations? (yes/no): ");
            ans = sc.next().toLowerCase();
        }
        
        sc.close();
    }
}