package file;

import java.io.File;
import java.io.IOException;

public class FileInfoDisplay {
	
	public static void main(String[] args) throws IOException {
		System.out.println("user.dir : " + System.getProperty("user.dir"));
		
		File file = new File("sample.txt");
		
		System.out.println("getName() : "+file.getName());
		System.out.println("getParent() : "+file.getParent());
		System.out.println("getPath() : " + file.getPath());
		System.out.println("getAbsolutePath() : " + file.getAbsolutePath());
		System.out.println("getCanonicalPath() : " + file.getCanonicalPath());
		System.out.println("length() : " + file.length() + " bytes");
		System.out.println("isFile() : " + file.isFile());
		System.out.println("isDirectory() : " + file.isDirectory());

	}

}
