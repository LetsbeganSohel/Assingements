/*Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it.

Problem Statement 2:
Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
1.	Adds the string ”- This is a sample program” to existing string and display it.
2.	Inserts the string “Object” into the existing string at 21st postion and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.

Problem Statement 3:
Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE
*/
package Private.Ltd;
import java.util.regex.*;
import java.util.*;
public class Problem113thOct {

	public static void main(String[] args) {
		String st="Welcome to Java World";
		String st1="Welcome";
		String st2="Let us learn";
      System.out.println(st.indexOf(5));
      System.out.println(st.concat(st2));
      System.out.println(st.compareToIgnoreCase(st2));
      System.out.println(st.indexOf("a"));
      System.out.println(st.replace('a', 'e'));
      System.out.println(st.indexOf(4, 10));
      System.out.println(st.toLowerCase());
      
      
      String sb="This is StringBuffer";
      String sb2="- This  is a sample programe";
      System.out.println(sb.concat(sb2));
      System.out.println(sb.length());
     StringBuffer ap = new StringBuffer(sb);           // create object of StringBuffer
     System.out.println(ap.insert(8, "Object"));  // insert  new string in 21th position
    ap.append(sb2);                                                      // to pass the string 
    System.out.println(ap.reverse());                         // reverse the string 
    System.out.println( sb.replace("Buffer", "Builder"));
    
    String sc="C:/IBM/DB2/PROGRAM/DB2COPY1.EXE.  ";
    StringTokenizer stz = new StringTokenizer (sc);                     // create a object of stringtokenizer class
    System.out.println("Driver :  "  +stz.nextToken("/")+"\\");   // delimeter of  string 
    System.out.println("Folder :  "  +stz.nextToken("/") + "||" +stz.nextToken("/")+"||" +stz.nextToken("/"));
    System.out.println("File :  "  +stz.nextToken("/"));    // after where it ends 
	}

}
