package test_4_13;
import java.util.Scanner;

public class check_char {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter");
		char ch = input.next().charAt(0);
		if(ch>='a' || ch<='z'){
			switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
			case 'w':System.out.println(ch + " is a vowel");break;
			default:System.out.println(ch + " is a consonant");break;
			}
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}