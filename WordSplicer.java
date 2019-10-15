import java.util.Scanner;


public class WordSplicer{

    public static void main (String [] args){

      Scanner scan = new Scanner(System.in);
      System.out.println("Please input a word or phrase");
      String originalStatment = scan.nextLine();
      originalStatment.toUpperCase();
      for (int i = 0; i < originalStatment.length(); i++){

        System.out.println(originalStatment.charAt(i));
      }
    }
}
