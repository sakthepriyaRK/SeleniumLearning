package week1.day2;

public class strtochar
{public static void main(String[] args) {
	String str="welcome";
 char charat=str.charAt(5);
 System.out.println(charat);
 int lengthstr= str.length();
	System.out.println(lengthstr);
	int indexof=str.indexOf('c');
	System.out.println(indexof);
	char[] chararr=str.toCharArray();
	for(int i=0;i<chararr.length;i++)
	{
		if(i%2!=0)
		{
		char upper=Character.toUpperCase(chararr[i]);
			System.out.print(upper);
		}
		else {
			System.out.print(chararr[i]);
		}
	}
	
	
	
}}
