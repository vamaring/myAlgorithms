package myJavaLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countLinesWordsCharactersInaFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lineCount=0;
		int wordsCount = 0;
		int charsCount = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vamsh\\Documents\\sample.txt"));
			String line = br.readLine();
			while (line != null) {
				lineCount++;
				String[] words = line.split(" ");
				wordsCount += words.length;
				
				for (String eachWord: words) {
					charsCount += eachWord.length();
				}
				
				line = br.readLine();
			}
			
			System.out.println("Total lines:" +lineCount);
			System.out.println("Total words:" +wordsCount);
			System.out.println("Total Characters:" +charsCount);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
