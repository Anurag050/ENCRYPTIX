import java.util.Scanner;

public class Game{
    //Function which is used to play game
    public static void NumberGame(){

        // This is a Scanner class
        Scanner scn = new Scanner(System.in);

        //It generate the numbers within 1 to 100 && Tycasting is also performing.
        int number = 1 + (int)(100 * Math.random());

        //Rounds of the Game (Here the user can only play for 3 rounds)
        int r = 5;
        //These are the variables which are going to use in this program
        int i,guess,choice,score;
            System.out.println("""
                            Welcome to the Number Guessing Game!
                            Choose the number between 1 to 100. 
                            You have 5 attempts to guess it.""");

        //for loop for the number of Rounds 
        for(i=0;i<r;i++){
            System.out.print("Guess the number: ");
            
            //Taking input from the user for guessing the number
             guess = scn.nextInt();
            //Condition for the correct number.
             if(number == guess){
                System.out.println("Congratulation! You guess the correct number. ");
                //It is used to terminate the condition, if the number is guessed correct.
                break;
                }
                //Higher condition 
                else if (number>=guess){
                    System.out.println("Too high! Try again. " + guess);
                }
                    //Lower condition 
                    else if (number<=guess) {
                        System.out.println("Too low! Try again. " + guess);
                    }
                } 
                //This ran when the 0 attempt is left
                if(i == r){
                        System.out.println("""
                                         Sorry! You ran out of time.
                                         The number is :   """ +  number);
                }
                        r--; //This is used for the decreament of the attempts while guesssing the number.
                       System.out.println("Game Over!");

                       //This is used,if the user want to replay the game .
                       System.out.println("Do you want to play again ? press 1 for yes || press 0 for no. ");
                       choice = scn.nextInt();

                        //It is used to know the score of the user on the basis of attempt.
                       score = 50-(i*10);

                       //if the user choose 1 then this will ran.
                        if(choice==1){ 
                            NumberGame();
                        }else{//if the user want to quit and know the score .
                            System.out.println("Thank you for playing!"+" You score is " + score);    
                        }
    }

    //Driver call        
    public static void main(String args[]){
        //Function call
        NumberGame();
    }
}