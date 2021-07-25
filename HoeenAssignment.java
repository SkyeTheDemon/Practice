// Instructions
// make a program that takes a number (integer) in from command line using the Scanner object. 
// Then check if the number is even or odd, print that info to the user eg: "5 is Odd", "8 is Even"

import java.util.Scanner; 
//Imports the Scanner class

public class Main {
    public static void main(String[] args)
    {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to check whether it is \"even\" or \"odd\""); 
        //Reads the value entered in the command prompt
        number = scanner.nextInt();

        if((number % 2)==0) 
        {
            System.out.println("The Given Number\""+number+"\" is Even"); 
        } 
        else
        {
            System.out.println("The Given Number\""+number+"\" is Odd");
        }
    }
}
