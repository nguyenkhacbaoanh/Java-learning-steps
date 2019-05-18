package POO;

public class FirstPas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		say_hello();
		System.out.println(char_to_int("123F3"));
		System.out.println("Number be conversed: " + char_to_int("123"));
		float flo = char_to_int("123");
		System.out.println("Number of float: " + flo);
		
	}
	//Exo1
	public static void say_hello() {
		System.out.println("Hello Groland!");
	}
	//Exo2
	public static int char_to_int(String args) {
		try {
			int num = Integer.parseInt(args);
			return num;
		} catch (NumberFormatException ex) {
			int num = 0;
			System.out.println("can't be conversed");
			return num;
		}
		
	}

}
