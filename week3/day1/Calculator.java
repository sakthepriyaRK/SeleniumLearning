package week3.day1;

public class Calculator {
	public void sub(int n1,int n2)
	{
		System.out.println(n1-n2);
	}
	public void sub(int n1,double n2) 
	{
		System.out.println(n1-n2);
}
	public void mul(int n1,int n2)
	{
		System.out.println(n1*n2);
	}
	public void mul(int n1,double n2) 
	{
		System.out.println(n1*n2);
}
	public void div(int n1,int n2)
	{
		System.out.println(n1/n2);
	}
	public void div(int n1,double n2) 
	{
		System.out.println(n1/n2);
}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.sub(10, 5);
		cal.sub(10, 34560);
		cal.mul(10, 5);
		cal.mul(10,34560);
		cal.div(10, 5);
		cal.div(10, 34560);
	}
}