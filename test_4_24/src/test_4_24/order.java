package test_4_24;
import java.util.*;

public class order {
	public static void main(String[] args) {
		System.out.println("Please Enter Three Cities");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first city:");
        String str1=in.nextLine();
        System.out.println("Enter the second city:");
        String str2=in.nextLine();
        System.out.println("Enter the third city:");
        String str3=in.nextLine();
        int result=str1.compareTo(str2);
        if(result<0) {
        	int result2=str2.compareTo(str3);
	        if(result2<0) {
	        	System.out.printf("The three cities in alphabetical order are  %s %s %s",str1,str2,str3);
	        	}
	        if(result2>0) {
	        	int result3=str1.compareTo(str3);
		        if(result3<0) {
		        	System.out.printf("The three cities in alphabetical order are  %s %s %s",str1,str3,str2);
		        	}
		        if(result3>0) {
		    	    System.out.printf("The three cities in alphabetical order are  %s %s %s",str3,str1,str2);
				    }
		        }
	        }
       if(result>0) {
    	   int result5=str1.compareTo(str3);
    	   if(result5<0) {
    		   System.out.printf("The three cities in alphabetical order are  %s %s %s",str2,str1,str3);
    		   }
		   if(result5>0) {
			   int result6=str2.compareTo(str3);
			   if(result6<0) {
				   System.out.printf("The three cities in alphabetical order are  %s %s %s",str2,str3,str1);
				   }
			   if(result6>0) {
				   System.out.printf("The three cities in alphabetical order are  %s %s %s",str3,str2,str1);
				   }
			   }
		   }
       }
	}


