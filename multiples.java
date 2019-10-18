import java.util.Scanner;


public class multiples{

    public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("please input a positive integer you want to find the multiples of");
      int startNum = scan.nextInt();
      if (startNum<=0){
        System.out.println("please input a positive integer");
        startNum = scan.nextInt();
      }
      System.out.println("please input the max multiple");
      int max = scan.nextInt();
      if (max<=0){
        System.out.println("please input a positive integer for the maximum");
        max = scan.nextInt();
      }
      for(int i = 0; i*startNum <= max; i++){
          System.out.print((i*startNum)+" ");
          if((i%5)==0){
          System.out.println();
        }
      }
    }
}
