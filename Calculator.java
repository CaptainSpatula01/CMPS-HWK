import java.util.Scanner;



public class Calculator {
    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to a homemade calculator!");
        System.out.println("Please enter an integer...");
        String intA = userInput.nextLine();

        System.out.println("Enter another number...");
        String intB = userInput.nextLine();

        System.out.println("");
        System.out.println("Integer A = " + intA + ", Integer B3 = " + intB + ".");

        System.out.println("Now enter in the operator, be careful of what you use!");
        String operator = userInput.nextLine();

        
        System.out.println(calculate(intA, operator, intB));
        
        
        userInput.close();
    }

    public static int calculate(String intA, String operator, String intB){
        int sum;
        //Take operator, find out which one it is, then use that operator on A and B
        int A = Integer.parseInt(intA);
        int B = Integer.parseInt(intB);

        if(operator == "+"){
            sum = A + B;
            System.out.println(sum);
        }
        else if(operator == "-"){
            sum = A - B;
            System.out.println(sum);
        }
        else if(operator == "*"){
            sum = A * B;
            System.out.println(sum);
        }
        else if(operator == "/"){
            sum = A / B;
            System.out.println(sum);
        }
        return sum;
       
    }

}
