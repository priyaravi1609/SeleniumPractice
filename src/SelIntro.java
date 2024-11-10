import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	    System.out.println("*******************************************************");

		//datatypes
		int num = 5;
		String name ="Priya";
		double dec= 9.88;
		char letter = 'r';
		boolean myCard = true;
		System.out.println(name);
	    System.out.println("*******************************************************");

		//Arrays
		int[] number = new int[6];
		number[0] = 4;
		number[1] =88;
		int[] number2 = {1,4,88,9,0};
		System.out.println(number2[4]);
	    System.out.println("*******************************************************");

		//Arrays using for Loop
		
		for(int i =0; i<number2.length; i++) {
			System.out.println(number2[i]);
		}
	    System.out.println("*******************************************************");

		
		String[] names = {"Priya", "Liya", "Hari"};
		for (int j=0; j< names.length; j++) {
			System.out.println(names[j]);
		}
	    System.out.println("*******************************************************");

		//Enhanced for loop for Arrays
		for(String s:names) {
			System.out.println(s);
		}
	    System.out.println("*******************************************************");

		int[] arr3 = {1,2,3,4,6,8,7,0};
		for (int k:arr3 ) {
			if (k%2==0) {
				System.out.println(k);
			}
		}
	    System.out.println("*******************************************************");

		int[] numbers = {3,5,6,7,9};
	    
	    System.out.println(numbers[0]);
	    int tot= numbers.length;
	    System.out.println(numbers.length);
	    System.out.println(numbers[tot-1]);
	    for(int i =numbers.length-1; i>=0; i--){
	        System.out.println(numbers[i]);
	    }
	
	    System.out.println("*******************************************************");

	    //arraylist
	    ArrayList<String> a =new ArrayList<String>();
	    a.add("Ravi");
	    a.add("Naveen");
	    a.add("Amudha");
	    a.add("Devaraj");
	    //a.remove(1);
	    System.out.println(a.get(0));
	    System.out.println("*******************************************************");

	    
	    //for loop for arraylist
	    for(int i=0;i<a.size();i++) {
	    	System.out.println(a.get(i));

	    }
	    System.out.println("*******************************************************");
	    for(String namess:a) {
	    	System.out.println(namess);
	    }
	}

}
