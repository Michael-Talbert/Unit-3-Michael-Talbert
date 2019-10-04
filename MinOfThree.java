import java.util.Scanner;

public class MinOfThree{

    public static void main (String [] args){
        System.out.println("Please input three numbers");


        Scanner scan = new Scanner(System.in);


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        if ((num2>=num1)&&(num3>=num1)){
          System.out.println("The smallest number is:"+num1);
        }
        else if ((num1>=num2)&&(num3>=num2)){
          System.out.println("The smallest number is:"+num2);
        }else{
            System.out.println("The smallest number is:"+num3);
        }
    }
}
