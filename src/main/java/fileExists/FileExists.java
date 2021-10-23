package fileExists;

import java.io.File;

public class FileExists {

	public  static String doesFileExist(String path) {
		File file = new File(path);
		
		try {
			if(file.exists()) {
				System.out.println("The file for the given path does exist");
			}
			else {
				System.out.println("The file does not exixt");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return path;
	}
	
}
