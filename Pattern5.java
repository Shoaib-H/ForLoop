package for_Loop;

public class Pattern5 {
	void pattern5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Pattern5 p5 = new Pattern5();
		p5.pattern5();

	}
}
