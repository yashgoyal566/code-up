/* This class helps us to find the length of longest substring without repeating characters.
   Class Owner: Yash Goyal
   Date: 17-09-2025
*/
import java.util.Scanner;
public class Substring{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine(); 
		sc.close();
		Substring l=new Substring(); 
		System.out.println(l.maxLenSubstring(s));
		
	}

	public int maxLenSubstring(String s){
		int maxlen=0;
		for(int i=0; i<s.length(); i++){
			String s1=""; 
			for(int j=i; j<s.length(); j++){
				char currentchar=s.charAt(j);
				
			
				if(s1.indexOf(currentchar)!=-1){
					break; 
				}
				else{
					s1=s1+currentchar;
					maxlen=Math.max(maxlen,s1.length());  
				}
			}
		}
		return maxlen;
	}

}
