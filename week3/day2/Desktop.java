package week3.day2;

public class Desktop implements   Hardware,Software {
	public void DesktopModel()
	{System.out.println("destop:"+"lenovo");
	}

	public void hardwareResources() {
		System.out.println("hardware resorces");
	}
	
public static void main(String[] args) {
	Desktop desk=new Desktop();
	desk.hardwareResources();
	desk.DesktopModel();
	desk.softwareResources();
}

public void softwareResources() {
	System.out.println("sw C");
	
}
}
