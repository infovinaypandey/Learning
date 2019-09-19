//this is first comment
package practice;

public class BiggestNumber {

	public void getBiggestNumber() {
		int a[] = { 9, 14, 5, 99, 8, 20, 8, 31 };

		int BiggestNumber = 0;
		for (int i = 0; i < a.length; i++) {
			int lenght = a.length - 1;
			if (a[i] > a[lenght]) {
				BiggestNumber = a[i];
				lenght--;
			}
		}
		System.out.println(BiggestNumber);
	}

	public static void main(String arg[]) {
		BiggestNumber bg = new BiggestNumber();
		bg.getBiggestNumber();
	}
}
