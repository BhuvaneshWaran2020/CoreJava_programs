package corejava;

import java.util.Scanner;

public class count_words_ina_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your string");
		 String input =sc.nextLine();
		 
		 int count = 1;
		 for(int i=0;i<input.length()-1;i++)
		 {
			 if((input.charAt(i)==' ') && (input.charAt(i+1)!=' ')) 
			 {
				 count++;
			 }
		 }
		 System.out.println(count);
		 
	}

}
