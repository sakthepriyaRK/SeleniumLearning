package loop;

public class Num3and5 {
public static void main(String[] args) {
		
		int num=21;
		if(num%3==0)
		{
			System.out.println("TRIZZ");
		}
		else if(num%5==0){
			System.out.println("FIZZ");
		}
		else if (num%3==0 && num%5==0)
		{
			System.out.println("TRIZZ-FIZZ");
		}
		
	}
}
