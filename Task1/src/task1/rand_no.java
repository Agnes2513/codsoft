package task1;

import java.util.*;
import java.util.Random;

class rand_no
{
    public static void main(String[] argv)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int attempts=0;
        int min=1;
        int max=100;
        int max_attempts=5;
        int score=0;
        char ch='y';
        int flag=0;
        do
        {
            int no_guess=rand.nextInt(100)+1;
            while(attempts < max_attempts)
            {
                System.out.println("Enter your guess:");
                int guess=sc.nextInt();
                attempts++;
                
                if(guess==no_guess)
                {
                    System.out.println("Your guess is correct!!");
                    score++;
                    flag=1;
                    break;
                }
                else if (guess<no_guess)
                {
                    System.out.println("Your guess is too low!!");
                }
                else
                {
                    System.out.println("Your guess is too High!!");
                }
               
            }
            if(flag==0)
            {
                System.out.println("Game over");
                System.out.println("The correct ans is :"+no_guess);
            }
            
            System.out.println("Score :"+score);
            attempts=0;
            System.out.println("Do you want to play again? y or n");
            flag=0; 
            ch=sc.next().charAt(0);
        }while(ch=='y');
        
        
    }
}
