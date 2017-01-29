package myJavaLearning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;


public class reverseSentence {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String input = "Rain Rain go away";
		String result = "";
		int index;
		
		while (( index = input.indexOf(" ")) >= 0) {
			result = input.substring(0,index) + " " + result;
			input = input.substring(index+1);
		}
	
		System.out.println(input + " " +result);
		
		
		
	}

}
