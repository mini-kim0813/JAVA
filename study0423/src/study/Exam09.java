package study;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오.>> ");
		int num = sc.nextInt();
		if(num>=0)
		{
			System.out.println(num+"의 절대값 : "+num);
		}else
		{
			System.out.println(num+"의 절대값 : "+num*-1);
		}
	}

}
