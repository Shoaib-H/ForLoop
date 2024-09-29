package for_Loop;

public class Pattern1 {
	void pattern() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern1 p1 = new Pattern1();
		p1.pattern();
	}
}
