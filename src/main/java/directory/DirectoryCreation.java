package directory;

import java.io.File;
import java.io.IOException;

public class DirectoryCreation {

	public static void main(String[] args) throws IOException {

		FileConfig fileConfig = new FileConfig();

		File dir1 = new File(fileConfig.getPathName() + "/dir1");
		boolean isMade = dir1.mkdir();
		System.out.println("new directory is made : " + isMade);

		File dir2 = new File(fileConfig.getPathName() + "/parent/dir2");
		isMade = dir2.mkdirs();
		System.out.println("new directory is made : " + isMade);
	}
}
