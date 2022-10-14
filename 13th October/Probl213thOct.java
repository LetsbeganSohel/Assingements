package Private.Ltd;
import java.util.Scanner;
class Regex{
	String num="(2[0-5][0-5]|[01]?[0-9][0-9]?)";
	String pattern = num +"."+num+"."+num+"."+num;
}

public class Probl213thOct {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter your ip address");
		while(sc.hasNext()) {
			String ip= sc.next();
			System.out.println(ip.matches(new Regex().pattern));
		}
		
	}

}
