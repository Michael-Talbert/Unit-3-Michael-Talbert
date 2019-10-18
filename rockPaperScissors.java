import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors{

    public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("please enter a username");
      String name = scan.nextLine();
      boolean constantT = true;
      boolean keepPlaying = true;
      int userChoiceInt = 0;
      double gamesWon = 0;
      double gamesPlayed = 0;
      String y = "y";
      String n ="n";
      if (name.equalsIgnoreCase("69")){
        System.out.println("nice");
      }else if (name.equalsIgnoreCase("Richard")){
        System.out.println("ha Dick");
      }else if (name.equalsIgnoreCase("Michael")){
        System.out.println("We should play heads up 7 up Mr.George.");
      }
      while (keepPlaying){
        int comp = rand.nextInt(3)+1;
        System.out.println("please enter either rock, paper, or scissors.");
        String userChoiceString = scan.nextLine();
        if(userChoiceString.equalsIgnoreCase("rock")){
          userChoiceInt = 1;
        } else if(userChoiceString.equalsIgnoreCase("paper")){
          userChoiceInt = 2;
        } else if (userChoiceString.equalsIgnoreCase("scissors")){
          userChoiceInt = 3;
        }else{
          continue;
        }
        if (comp == userChoiceInt){
          System.out.print("computer: "+ userChoiceString +"\nhuman: "+ userChoiceString);
          System.out.println("You tied");
          gamesPlayed++;
        }else if ((comp==3 && userChoiceInt==1) || (comp==1 && userChoiceInt==2) || (comp==2 && userChoiceInt==3)){
          System.out.println("\nyou Won!!\n");
          gamesWon++;
          gamesPlayed++;
        }else{
          System.out.println("You lost:(");
          gamesPlayed++;
        }

        //asks player if they want to keep playing
          System.out.println("Do you want to keep playing? (y/n)");
          String contPlay = scan.nextLine();
          if (contPlay.equalsIgnoreCase(n)){
            keepPlaying = false;
      }
      }

      //calculates win percentage and gives the output to the user
      Double winPercentage = (gamesWon/gamesPlayed)*100;
      System.out.println("Thank you for playing "+name+"!!, you won "+winPercentage+" percent of games!");
    }
}
