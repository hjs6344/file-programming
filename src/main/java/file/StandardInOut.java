package file;

import java.io.IOException;

public class StandardInOut {
	
	public static void main(String[] args) throws IOException {
		byteToString();
	}

	private static void byteToString() throws IOException {
		
		byte[] bytes = new byte[16];
		System.out.println("�Է��ϼ���. ->");
		System.in.read(bytes);
		
		String value = new String(bytes);
		System.out.println("�Է��� ������ : '"+value+"'�Դϴ�.");
		
	}

}
