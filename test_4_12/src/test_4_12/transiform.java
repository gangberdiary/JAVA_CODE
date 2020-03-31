package test_4_12;
import java.util.Scanner;

public class transiform {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a hex digit: "); 
		char ch = input.next().charAt(0); 
		int n = 1;
		int i = 0;
		int[] arr = new int [8];
		if (ch <= 'F' && ch >= 'A') { 
			int value = ch - 'A' + 10; 
			while(value>0) {
				n = value % 2;
				arr[i] = n;
				i++;
				value = value / 2;
				}
			System.out.print("The binary value is ");
			for(i=i-1; i>=0; i--){
				System.out.print(arr[i]);
				} 
			System.out.print("\n");
			}
		else if (Character.isDigit(ch)) {
			int num = ch - 48;
			while(num>0) {
				n = num % 2;
				arr[i] = n;
				i++;
				num = num / 2;
				}
			System.out.print("The binary value is ");
			for(i=i-1; i>=0; i--){
				System.out.print(arr[i]);
				} 
			System.out.print("\n"); 
			} 
		else { 
			System.out.println(ch + " is an invalid input");
			} 
		} 
	}

