import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int changes = 8;
       int finals = 0;
       boolean playAgain = true;
       System.out.println("you have about"+changes+"to win the game");
       while(playAgain){
           int rand = getrandN(1,100);
           boolean guess = false;
            for(int i=0;i<changes;i++){
                   System.out.println("changes"+(i+1)+"enter your guess");
                   int user= sc.nextInt();
                   if(user==rand){
                       guess = true;
                       finals += 1;
                       System.out.println("you on it.");
                       break;
                   }
                   else if(user>rand){
                       System.out.println("too high");
               }
                   else{
                       System.out.println("too low");
                    }
                }
               if(guess == false){
                   System.out.println("Sorry buddy. please change the number"+rand);
                }
               System.out.println("Do you want to play Again");
               String pA = sc.next();
               playAgain=pA.equalsIgnoreCase("y");
           }
           System.out.println("hope you enjoyed it");
           System.out.println("here is your Score"+finals);
       }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);
        }
    }
