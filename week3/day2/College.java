package week3.day2;

public class College extends University{
	public void coldetail()
	{System.out.println("college detail");
	}


public static void main(String[] args) {
	
	College col=new College();
	col.ug();
	col.pg();
	
}


@Override
public void ug() {
	// TODO Auto-generated method stub
	System.out.println("ug");
}
}