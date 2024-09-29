package for_Loop;

public class Pattern3 {
	void pattern3() {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public static void main(String[] args) {
		Pattern3 p3 = new Pattern3();
		p3.pattern3();

	}
}
