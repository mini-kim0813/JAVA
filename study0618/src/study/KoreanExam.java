package study;

public class KoreanExam {

	public static void main(String[] args) {

		Korean k1 = new Korean("한겨울",20);
		Korean k2 = new Korean("이른봄",25);
		
		k1.name = "한여름";
		
		System.out.println("k1.name = "+ k1.name);
		System.out.println("k1.age = "+ k1.age);
		
		
	}

}
