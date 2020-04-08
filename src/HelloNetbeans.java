
/**
 * @author paolram
 */

import java.util.Scanner;

public class HelloNetbeans 
{
       public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("You will now enter an integer to convert from feet to inches:");
        int a;
        a = s1.nextInt();
        System.out.println("That is " + a + " feet");
        System.out.println("The converted integer is " + a*12 + " inches");
    }
}



 