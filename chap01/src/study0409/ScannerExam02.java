package study0409;

import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ���. >> ");
		String name = scan.nextLine();
		
		System.out.print("���� �ϳ��� �Է����ּ���.");
		int num = scan.nextInt();
		
		System.out.println("name = " + name);
		System.out.println("num = " + num);
	}

}