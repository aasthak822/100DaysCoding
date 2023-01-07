/*	Write a program to find whether the given string is ANAGRAM or not
SOLUTION */



public class Anagram {
	public static void main(String args[]) {
		String s1="eat",s2="ate";
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		char temp;
		
	 if(ch.length==ch1.length) {
		 for(int i=0;i<ch.length;i++) {
			 for(int j=1;j<ch.length-i;j++) {
				 if(ch[j-1]>ch[j]) {
					temp=ch[j-1];
					ch[j-1]=ch[j];
					ch[j]=temp;
				 }
				 if(ch1[j-1]>ch1[j]) {
					 temp=ch1[j-1];
					 ch1[j-1]=ch[j];
					 ch[j]=temp;
				 }
			 }
		 }
		 int i;
		 for(i=0;i<s1.length();i++) {
			 if(ch[i]!=ch1[i])
				 break;
			 
		 }
		 if(i==ch.length) {
			 System.out.println("Anagram");
		 }
			 else
				 System.out.println("Anagram");
			 
	 }
	 else {
		 System.out.println("NOT AN ANAGRAM");
	 }
	}
}
