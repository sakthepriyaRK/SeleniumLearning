package loop;

public class ObjectDeclaration {
	int model=19;
	String brandname="lenovo";
	char version='A';
	float pixel=3.3F;
	int cost=30000;
	
	public void makecall() {
		// TODO Auto-generated method stub

	}
	public void takepic() {
		// TODO Auto-generated method stub

	
}
	
public static void main(String[] args) 
{
	ObjectDeclaration mobile=new ObjectDeclaration();
	mobile.brandname="lenovo";
mobile.version='A';
	mobile.makecall();
	mobile.takepic();
	System.out.println(mobile.brandname);
	System.out.println(mobile.pixel);
}
}


