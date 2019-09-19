package praticesJava;

public class BiggestNumber {
	public static void getBiggestNumber() {
		int a[] = { 100, 5, 20, 5, 555, 3, 1000000, 60, 55, 99, 1099 };
		
		int b;

		int BiggestNumber = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > BiggestNumber) {
				
				BiggestNumber = a[i];
			}
		}

		System.out.println(BiggestNumber);

	}

	public static void main(String[] args) {
		getBiggestNumber();
	}

}
