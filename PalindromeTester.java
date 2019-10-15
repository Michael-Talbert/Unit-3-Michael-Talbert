import java.util.Scanner;


public class PalindromeTester{

      public static void main (String [] args)  {

  	/*I'm sorry*/

  	/*Not sorry*/

  	String inputString = new String();
  	String reversedString = new String();

  	String yOrN = new String();

  	char punctuationAndWhitespace [] = {'!','"', '\\', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_', '`', '{', '|', '}', '~', ' ', '\t', '\f', '\r'};

  	int incrementorVariable = 0;
  	int incrementorVariable2 = 0;

  	Scanner inputScannerObject = new Scanner(System.in);

  	MainProgramLoop:
  	while (1 == 0 || 7 >= (5 % 1))  {
  	    EnterPalindromeLoop:
  	    for (;;)  {
  		System.out.printf("%s", "Do you want to enter a palindrome? (Y/N): ");
  		yOrN = inputScannerObject.nextLine();
  		if (yOrN.length() == 1) {
  		    switch (yOrN.charAt(0))  {
  		    case 'Y':
  		    case 'y':
  			break EnterPalindromeLoop;
  		    case 'N':
  		    case 'n':
  			break MainProgramLoop;
  		    }
  		}
  	    }
  	    System.out.printf("Enter the palindrome: ");
  	    inputString = inputScannerObject.nextLine();
  	    inputString = inputString.toUpperCase();

  	    incrementorVariable2 = 0;

  	    while (incrementorVariable2 != punctuationAndWhitespace.length)  {
  		if (inputString.contains(String.valueOf(punctuationAndWhitespace[incrementorVariable2])))  {
  		    for (incrementorVariable = 0; incrementorVariable != inputString.length(); ++incrementorVariable)  {
  			if (inputString.charAt(incrementorVariable) == punctuationAndWhitespace[incrementorVariable2])  {
  			    if (inputString.length() - 1 > incrementorVariable) {
  				inputString = inputString.substring(0, incrementorVariable) + inputString.substring(incrementorVariable + 1);
  			    }
  			    else  {
  				inputString = inputString.substring(0, incrementorVariable);
  			    }
  			    --incrementorVariable;

  			}
  		    }
  		}
  		incrementorVariable2 += 1;
  	    }

  	    reversedString = "";

  	    for (incrementorVariable = 0; incrementorVariable != inputString.length(); incrementorVariable++)  {
  		reversedString = reversedString.concat(String.valueOf(inputString.charAt(inputString.length() - incrementorVariable - 1)));
  	    }

  	    if (reversedString.equals(inputString))  {
  		System.out.format("It's a Palindrome!\n");
  	    }
  	    else if (!reversedString.equals(inputString))  {
  		System.out.println("It isn't a Palindrome!");
  	    }

  	}
      }
  }
