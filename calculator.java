import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers:  ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        double result;
        //now its the specific operations 
        switch(operator)
        {
            case '+':
            result = first + second;
            break;
            case '-':
            result = first - second;
            break;
            case '*':
            result = first * second;
            break;
            case '/':
            result = first / second;
            break;
            //when the operator does not match any of the matched 

            default:
            System.out.printf("Error! operator is not correct");
            return;
        }
        //printing the result of the operations 
        System.outprintf("%.1f %c %.1f", first, operator, second, result);
    }
}
