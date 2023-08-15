import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Kenar 1: ");
		int a = scanner.nextInt();
		
		System.out.println("Kenar 2: ");
		int b = scanner.nextInt();
		
		int c = (int) Math.sqrt((a*a) + (b*b));
		
		System.out.println("Hipotenus: " + c);
		

	}

}
