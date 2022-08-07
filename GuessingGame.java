import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int num,value=0;
        System.out.println(" Guess the number between 1 to 10");
        num= sc.nextInt();
        Random random = new Random();
        for ( int i =1;i<=10;i++)
        {
            value = random.nextInt((10-1)+1)+1;

        }
        try{
            while(num!=value)
            {
                if(num<value)
                {
                    System.out.println("The Guessed number is less than the correct answer");
                    num = sc.nextInt();
                }
                if (num>value)
                {
                    System.out.println("The Guessed number is greater than the correct answer");
                    num=sc.nextInt();

                }
            }
        }

        catch(Exception e)
        {
            System.out.println("exeception");
        }
        System.out.println("You Guessed the right answer");
    }
}