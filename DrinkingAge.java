import java.util.Scanner;

public class DrinkingAge{

    public static void main (String [] args){
      System.out.println("Please input your age!");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age>= 21){
          System.out.println("Party on dude!!");
        } else
          System.out.println("sorry dude no drinks for you :(");


    }
}
