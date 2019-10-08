import java.util.Scanner;


public class WinPercentage{

  public static void main(String[] args){
    System.out.println("Please input the number of games you have played");
    Scanner scan = new Scanner(System.in);
    double gamesPlayed = scan.nextDouble();
    System.out.println("Please input the number of games won");
    double gamesWon = scan.nextDouble();

    while( (gamesPlayed<=0) || (gamesWon>gamesPlayed) || (gamesWon<0) || (Math.round(gamesWon)!=gamesWon) || (Math.round(gamesPlayed)!=gamesPlayed)){
      if(gamesPlayed<=0){
      System.out.println("total games played must be greater than zero\n");
    } else if(gamesWon>gamesPlayed){
      System.out.println("you haven't played enough games to win that many\n");
    } else if(gamesWon<0){
      System.out.println("you can't win negative games\n");
    } else if(Math.round(gamesWon)!=gamesWon){
      System.out.println("games have to be a whole number \n");
    }else if(Math.round(gamesPlayed)!=gamesPlayed){
      System.out.println("games have to be a whole number \n");
    }
    System.out.println("Please input your numbers again");
    System.out.println("Games Played?");
    gamesPlayed = scan.nextDouble();
    System.out.println("Games Won?");
    gamesWon = scan.nextDouble();
    }
    double winPercentage = gamesWon/gamesPlayed;
    winPercentage = winPercentage*100;
    System.out.println("Your win percentage is "+winPercentage+"%");
  }

}
