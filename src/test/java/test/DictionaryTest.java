package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dictionary_Practical.ReadDictionaryData;

public class DictionaryTest {

	@Test
	public void readWordandPossiblemeaning() {
		
		ReadDictionaryData xlReader = new ReadDictionaryData("data\\Dictionary.xlsx");
//		xlReader.getData();																//This is not reading empty cell values, so using iterator
		xlReader.getDataUsingIterator();
		
	}
	
}
