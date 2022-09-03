//Fetching Middle Characters from String
//Write a program to read a string of even length and to fetch two middle
//most characters from the input string and return it as string output.
//Include a class UserMainCode with a static method getMiddleChars which
//accepts a string of even length as input . The return type is a string
//which should be the middle characters of the string.
//Create a class Main which would get the input as a string and call the
//static method getMiddleChars present in the UserMainCode.
//Input and Output Format:
//Input consists of a string of even length.
//Output is a string .
//Refer sample output for formatting specifications.
//Sample Input 1:
//this
//Sample Output 1:
//hi


package problemstatement;

import java.util.Scanner;

public class EvenMiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string;
	        Scanner scanner = new Scanner(System.in);
	        string = scanner.next();
	        int length = string.length()-1;
	        if(string.length()%2==0)
	        {
	      String midcharString=  EvenMiddleChar(string,length);
	      System.out.println("Middle characters  "+midcharString);
	        }else {System.out.println("entered string length in not even");}
	}

	private static String EvenMiddleChar(String string, int length) {
		// TODO Auto-generated method stub
		int mid = length/2;
		String midch="";
	   midch=midch+string.charAt(mid)+string.charAt(mid+1);
	   return midch ;
	}

}
