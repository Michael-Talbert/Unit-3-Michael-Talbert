import java.util.Scanner;

public class DrivingAge{

    public static void main (String [] args){
      System.out.println("Please input your age!");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age>= 21){
          System.out.println("Don't drink and drive");
        } else if(age>=16){
          System.out.println("sorry dude no drinks for you :( But hey at least you can drive");
        }
        else{
          System.out.println("go back to the daycare baby!!");
        }

    }
}
