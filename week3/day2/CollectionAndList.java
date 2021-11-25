package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAndList {
public static void main(String[] args) {
	
//	Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//	get the length of the array		

//	sort the array			

//	Iterate it in the reverse order

//	print the array
	
//	Required Output: Wipro, HCL , CTS, Aspire Systems
	String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
	List<String> data=new ArrayList<String>();
	System.out.println(data.size());
	Collections.sort(data);
	
	
	for (String eachdata: input) {
		//
		

	System.out.println(eachdata);
	}	

}
}
