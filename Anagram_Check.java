package codingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(anagram(s1,s2));
	}
	public static boolean anagram(String s1,String s2) {
		if(s1.length()==s2.length()) {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String res=new String(ch1);
			String res1=new String(ch2);
			if(res.equals(res1))
				return true;
			else
				return false;
			
		}
		else 
			return false;
		
	}

}
