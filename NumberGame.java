{
 
    public class NumberGame{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int changes = 0;
       int finals = 0;
       boolean playAgain = true;
       System.out.println("you have about"+changes+"to win the game");
       while(playAgain){
           int rand = getrandN(1,100);
           boolean guess = false;
           for(int i=0;i<changes;i++){
               boolean guess=false;
               for(int i=0;i<changes;i++){
                   System.out.println("changes"+(i+1)+"enter your guess");
                   int user= sc.nextInt();
                   if(user==rand){
                       guess = true;
                       finals += 1;
                       System.out.println("you on it.");
                       break;
                   }
                   else if(user>guess) {
                       System.out.println("Too High");
                   }
                   else{
                       System.out.println("Too low");
                   }
               }
       }
    }
}
