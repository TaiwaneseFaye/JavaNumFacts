//Number Facts Assignment
//Chris Sun
//Takes a number entered by user and gives it back along with whether if its a square root, prime, and its factor pairs

package numFacts;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NumFacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 1000: "); //asking the user to enter a number
		int num = keyboard.nextInt();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date start = new Date();
		System.out.println("Starting processing " + start);
		System.out.printf("Number\t"+"sqrt\t"+"prime\t"+"pairs"); //heading layout for the display
		
		if(num>1) {//loop that checks if the number is greater then 1 to keep running the loop
		
		do {
			
		String factorPair = ""; //factor pairs
		int i = 1;
		int result = 0;
		int pairsCounter = 0;
		String myPairs = "";
		int sqrt = 0;
		
		
		do  {
			result = num / i;
		
		if (num % result == 0 && num % i == 0) {
			factorPair = "("+result+ ", "+ i+ ") ";
			pairsCounter ++;
			myPairs = myPairs + factorPair;
			if (result == i) {
				sqrt = i;
			}

			

		}

		}while (++i < result);//end loop
		System.out.printf ("%n%d \t%s\t%s\t%s", num, sqrt>0?Integer.toString(sqrt):"", pairsCounter > 1?"No":"Yes", myPairs); //displays the results back to the user
		num--;
		}while(num>1);
		System.out.println("\n1\t"+"1\t"+"yes\t"+"(1, 1)");//outprints the last result of 1 because if loop was checking for num>0 runs into math error 
		}else {//outprints the result for 1 if, 1 is the inputted number
			System.out.println("\n1\t"+"1\t"+"yes\t"+"(1, 1)");
		}	
		Date stopTime = new Date();
		long diff = stopTime.getTime() - start.getTime();
		System.out.println("Start processing " + dateFormat.format(start) + "  Stop processing: " + dateFormat.format(stopTime) + "  Difference: " + diff); 
	}// end of method

}//end of class
