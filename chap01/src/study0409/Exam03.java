package study0409;

public class Exam03 {

	public static void main(String[] args) {

		int pencil = 534;
		int student = 30;
		
		int pencilsPerStudent = 534/30;
		System.out.println("학생 1명이 가지는 연필의 개수 : " + pencilsPerStudent);
		
		int pencilsLeft = 534 % 30;
		System.out.println("남은 연필의 개수 : " + pencilsLeft);
	}

}
