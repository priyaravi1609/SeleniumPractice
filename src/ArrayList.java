import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"Priya", "Ravi", "Naveen"};
		//now the above is an array..
		//if we need to convert it to an arraylist below is the formart
		List<String> nameArrayList =Arrays.asList(name);
		System.out.println(nameArrayList.contains("Priya"));
		
		//Strings in Java How to declare strings and important string methods
		String a=  "Priya";
		String b = "Priya";
		//The above is called string literal. Now there is a also string as an 
		//object where string is created with new method as below.
		//Here no matter what , a new object (space) will be created for each object when a string a
		String test = new String("Rahul Shetty Academy");
		//to trim we can use Trim method that will trim the spaces.
		//now we are going to split it and store in an array and call them.
		String[] arrayval=test.split(" ");
		for (String s : arrayval) {
			System.out.println(s);
		}
		//in case am need char wise, then follow the below.
		for (int i =0; i<test.length(); i++) {
			System.out.println(test.charAt(i));
		}
		
		//in case i to reverese the same
		for (int i=test.length()-1;i>=0;i--) {
			System.out.println(test.charAt(i));

		}
	}

}
