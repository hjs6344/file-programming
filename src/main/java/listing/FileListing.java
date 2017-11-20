package listing;

import java.io.File;
import java.io.IOException;

public class FileListing {

	public static void main(String[] args) throws IOException {

		FileConfig fileConfig = new FileConfig();

		File directory = new File(fileConfig.getPathName());
		System.out.println("file.isDirectory() : " + directory.isDirectory());

		/*for (File file: directory.listFiles()) {
			System.out.println((file.isFile() ? "[F] " : "[D] ") + file.getName());
		}*/
		
		listing(fileConfig.getPathName());
		
	}
	
	//screwed!!
	public static void listing(String path){
		File directory = new File(path);
		if(directory.isDirectory()){
			for(File file: directory.listFiles()){
				System.out.println((file.isFile() ? "[F] " : "[D] ") + path+ "/"+file.getName());
				listing(path+"/"+file.getName());
			}
		} else {
			System.out.println("[F]"+path+"/"+directory.getName());
		}
	}
}
