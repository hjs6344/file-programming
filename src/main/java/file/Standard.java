package file;

import java.util.Scanner;

public class Standard {

	public static void main(String[] args) {
		System.out.println("1���� 5 ������ ������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		if (0 < choice && choice <= 5) {
			System.out.println("�Է��� ���� " + choice + "�Դϴ�.");
		} else {
			System.out.println("1���� 5 ������ ������ �����մϴ�.");
		}
	}
}
