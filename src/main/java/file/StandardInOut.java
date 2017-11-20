package file;

import java.io.IOException;

public class StandardInOut {
	
	public static void main(String[] args) throws IOException {
		byteToString();
	}

	private static void byteToString() throws IOException {
		
		byte[] bytes = new byte[16];
		System.out.println("입력하세요. ->");
		System.in.read(bytes);
		
		String value = new String(bytes);
		System.out.println("입력한 내용은 : '"+value+"'입니다.");
		
	}

}
