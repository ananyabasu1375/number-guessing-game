import java.util.Random;
import java.util.Scanner;

class Guess
{
    public int number;
    public int input_number;
    public int No_of_guess = 0;
    public int getNo_of_guess()
    {
        return No_of_guess;
    }
    public void setNo_of_guess(int No_of_guess)
    {
        this.No_of_guess = No_of_guess;
    }
    Guess()
    {
        Random r = new Random(); 
        this.number = r.nextInt(100);
    }
    void input()
    {
        System.out.println("-------------------");
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        input_number = sc.nextInt();
    }
    boolean isCorrect()
    {
        No_of_guess++;
        if(input_number == number)
        {
            System.out.println("*==================================*");
            System.out.print("||          -:Result:-           ||\n||           --------            ||\n");
            System.out.format("||         Congratulations!!!    ||\n||You guessed the number Right!!!||\n||           It was %d           ||\n|| [ You guessed in %d attempts ] ||\n",number,No_of_guess);
            System.out.println("*==================================*");
            return true;
        }
        else if(input_number < number)
        {
            System.out.println("Too Less...");
            System.out.println("Please try a little high");
            System.out.println("-------------------");
        }
        else if(input_number > number)
        {
            System.out.println("Too High...");
            System.out.println("Please try a little less");
            System.out.println("-------------------");
        }
        return false;    
    }
}
public class Number_guess
{
    public static void main(String args[])
    {
        Guess g = new Guess();
        while(true)
        {
            g.input();
            g.isCorrect();
        }
        
    }
}
