import java.util.Scanner;


public class WinPercentage{

  public static void main(String[] args){
    System.out.println("Please input the number of games you have played");
    Scanner scan = new Scanner(System.in);
    double gamesPlayed = scan.nextInt();
    System.out.println("Please input the number of games won");
    double gamesWon = scan.nextInt();

    while( (gamesPlayed<=0) || (gamesWon>gamesPlayed) || (gamesWon<0) ){
      if(gamesPlayed<=0){
      System.out.println("total games played must be greater than zero");
    } else if(gamesWon>gamesPlayed){
      System.out.println("you haven't played enough games to win that many");
    } else if(gamesWon<0){
      System.out.println("you can't win negative games");
    }
    System.out.println("Please input your numbers again");
    System.out.println("Games Played?");
    gamesPlayed = scan.nextInt();
    System.out.println("Games Won?");
    gamesWon = scan.nextInt();
    }
    double winPercentage = gamesWon/gamesPlayed;
    winPercentage = winPercentage*100;
    System.out.println("Your win percentage is "+winPercentage+"%");
  }

}
