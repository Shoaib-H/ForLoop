package for_Loop;

public class Pattern6 {
	int n = 5;
	int x = 2;
	void pattern6() {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j>= i; j--) {
				System.out.print(" " + x +  " ");
				x +=2;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Pattern6 p6 = new Pattern6();
		p6.pattern6();

	}
}
