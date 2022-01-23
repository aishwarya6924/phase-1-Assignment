import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class EmailIdValidation {

	 public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();
		 
		 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = new ArrayList<String>();
		 // valid emails
		 emails.add("Aishu@gmail.com");
		 emails.add("Ammu123@hlc.com");
		 emails.add("Akshu@hlc.me.org");
		 //invalid emails
		 emails.add("Aishu.123.com");
		 emails.add("aaa..ns#hlc.com");
		 emails.add("@,123.com");
		 
		 for (String value : emails) {
		 System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		 }
		 
		 System.out.println("Enter any email address to check");
		 Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

	}

}
