package test_4_14;
import java.util.*;

public class transform {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade:");
		char ch = input.next().charAt(0);
		if(ch>='A' || ch<='Z'){
			switch(ch){
			case 'A':System.out.println(" The numeric value for grade " + ch + " is 4");break;
			case 'B':System.out.println(" The numeric value for grade " + ch + " is 3");break;
			case 'C':System.out.println(" The numeric value for grade " + ch + " is 2");break;
			case 'D':System.out.println(" The numeric value for grade " + ch + " is 1");break;
			case 'F':System.out.println(" The numeric value for grade " + ch + " is 0");break;
			default:System.out.println(ch + " is an invalid grade");break;
			}
		}
	}
}
