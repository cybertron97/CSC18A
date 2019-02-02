// Filename RockPaperScissors.java
// Written by Tanish
// Written on 1/22/17
/* In the game Rock Paper Scissors, two players simultaneously choose one of three
options: rock, paper, or scissors. If both players choose the same option, then the
result is a tie. However, if they choose differently, the winner is determined as
follows:
l Rock beats scissors, because a rock can break a pair of scissors.
l Scissors beats paper, because scissors can cut paper.
l Paper beats rock, because a piece of paper can cover a rock.
Create a game in which the computer randomly chooses rock, paper, or scissors.
Let the user enter a number 1, 2, or 3, each representing one of the three choices.
Then, determine the winner. Save the application as RockPaperScissors.java.
*/
//author @tanish arora
import java.util.*; //imports all java utitlities
public class RockPaperScissors {
    
   //---------------------------------------------------------------
    // game starts
    //--------------------------------------------------------------
    public static void main(String[] args){
    Scanner inputDevice = new Scanner(System.in);
    int userChoice;
    System.out.print("Please enter what you want to chose (1-Rock, 2-Paper, 3-Scissors)(please enter a integer value only(1,2,3)):   ");
    userChoice= inputDevice.nextInt();
    Random rand=new Random();//random function
    int compChoice= rand.nextInt(3)+1;
    
    //display the results-------------------------------------------
    if(userChoice==compChoice)
    {
        if (userChoice==1)
        {
        System.out.println("Results tied!Both of you selected Rock");
        }
        if (userChoice==2)
        {
        System.out.println("Results tied! Both of you selected Paper");
        }
        if (userChoice==3)
        {
        System.out.println("Results tied! Both of you selected Scissors");
        }
    }
    else if (userChoice==1&&compChoice==3)
    {
        System.out.println("You chose Rock!, I chose Scissors: You win! (as Rock beats scissors) ");
        
    }
    else if (userChoice==1&&compChoice==2)
    {
        System.out.println("You chose Rock!, I chose paper: I win! (as paper beats rock) ");
        
    }
    else if (userChoice==2&&compChoice==1)
    {
        System.out.println("You chose paper!, I chose Rock : You win! (as paper beats rock) ");
        
    }
    else if (userChoice==2&&compChoice==3)
    {
        System.out.println("You chose paper!, I chose scissors: I win! (as Scissor cuts paper) ");
        
    }
    else if (userChoice==3&&compChoice==2)
    {
        System.out.println("You chose Scissors!, I chose paper: You win! (as Scissors cut paper) ");
        
    }
    else if (userChoice==3&&compChoice==1)
    {
        System.out.println("You chose Scissors!, I chose rock: I win! (as rocks beat scissors) ");
        
    }
    
}
}