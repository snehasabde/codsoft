import java.util.Scanner;
import java.util.Random;

public class Task1 {
    private static void playGame() {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int initial=1;
        int last=100;
        int target=random.nextInt(last-initial+1);
       
        int Guess;
        int attempts=0;
        System.out.println(" ................NUMBER SYSTEM GAME............... ");
        System.out.println("I Have Entered a Number Can You Guess The Number.........?");
       
        do{
            System.out.println("Enter The Guess Number ");
            Guess=sc.nextInt();
            attempts++;
            if(Guess == target) {
                System.out.println("CONGRATULATION ! You Guess The Right Number....");
                break;
            }
            else if(Guess < target) {
                System.out.println("Try Again !, You have enter the Low number,Guess the High Number");                
            }else{ 
                System.out.println("Try Again !, You have enter the High number,Guess the Low Number");
            }

        }while(attempts <= 4);

    }
    public static void main(String[]args) {
       Scanner scanner = new Scanner(System.in);

       while(true) {
        System.out.println("Press 1 to play the game else press 0 to exit ");
        int sc = scanner.nextInt(); 

        if(sc == 1) {
             playGame();
        } else {
            break;
        }
      

       }
   
    }
    
}
