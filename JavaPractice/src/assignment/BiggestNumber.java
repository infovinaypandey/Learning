package assignment;

public class BiggestNumber {

	public void getBiggestNumber() {
		int a[] = { 10099, 4, 8, 10, 11, 55, 88, 3, 6, 101 };

		int BiggestNumber = a[0];
		int SecondBiggestNumber = a[1];

		if (BiggestNumber < SecondBiggestNumber) {
			BiggestNumber = a[1];
			SecondBiggestNumber = a[0];
		} else {
			BiggestNumber = a[0];
			SecondBiggestNumber = a[1];
		}
		for (int i = 1; i < a.length; i++) {
			if (BiggestNumber < a[i]) {

				BiggestNumber = a[i];
			}
		}

		System.out.println(BiggestNumber);
		System.out.println(SecondBiggestNumber);

	}

	public static void main(String[] args) {
		BiggestNumber bigValue = new BiggestNumber();
		bigValue.getBiggestNumber();
	}
}
