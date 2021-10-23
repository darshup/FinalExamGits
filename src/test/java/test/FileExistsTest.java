package test;
import org.testng.annotations.Test;

import fileExists.FileExists;

public class FileExistsTest {
	
	@Test
	public void checkIfFileExists() {
		
		FileExists fileExixts = new FileExists();
		
		fileExixts.doesFileExist("data\\Dictionary.xlsx");
		
	}
}
