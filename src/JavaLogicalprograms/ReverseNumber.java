package JavaLogicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public void Reverse()
    {
        System.out.println("\n Enter a Number for Reverse");
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}

