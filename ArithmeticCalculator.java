import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("eneter the two numbers");
		
		int num1=sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double Ans=0;
		switch(op){
		case '+': Ans=num1+num2;
					break;
		case '-':Ans=num1-num2;
					break;
		case '*': Ans=num1*num2;
					break;
		case '/':Ans=num1/num2;
					break;
					
		default : System.out.println("enter the correct operator");
		}
		System.out.println("the answer is " +Ans);
	}

}
