package assignment;

public class SecondLargestNumber {

	public void getSecondHigestNumber() {
		int a[] = { 2, 44, 7, 4, 2, 5, 7, 5, 55, 4, 4433, 10000 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int lenght = a.length;
		System.out.println("Highest number is :" + a[lenght - 1]);
		System.out.println("Second highest number is :" + a[lenght - 2]);

	}

	public static void main(String[] args) {
		SecondLargestNumber secNum = new SecondLargestNumber();
		secNum.getSecondHigestNumber();
	}
}
