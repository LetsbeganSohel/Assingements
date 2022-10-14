/*Write a Java program to find sequences of lowercase letters joined with a 
 * underscore.*/
package Private.Ltd;
import java.util.Scanner;
public class probl313tOct {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String");
		String st=sc.next();
		if(st.matches("[a-z]+_[a-z]+")) {
			System.out.println("Found matches");
		}
		else {
			System.out.println("Not Matches");
		}
	}

}
