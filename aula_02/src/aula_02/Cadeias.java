package aula_02;

public class Cadeias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Generation Brasil";
		String s2 = "Generation BRASIL";
		String s3 = "Generation BrasiL";
		
		System.out.println(s1 == s3); 
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		
	}

}
