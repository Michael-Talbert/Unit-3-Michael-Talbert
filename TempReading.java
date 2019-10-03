import java.util.Scanner;

public class TempReading{

    public static void main (String [] args){
      System.out.println("Please input the tempature");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        if (temp > 83){
          System.out.println("hot");
        } else if (temp >68){
          System.out.println("Ideal");
        }else if (temp > 45){
          System.out.println("cool");
        } else{
          System.out.println("Cold");
        }

    }
}
