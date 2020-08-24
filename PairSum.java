import java.util.*;

public class PairSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int op = s.nextInt();
		int[] intArray = new int[size];
		for (int i = 0; i < size; i++) {
			intArray[i] = s.nextInt();
		}
		if (hasArrayOutput(intArray, size, op)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	static boolean hasArrayOutput(int A[], int arr_size, int sum) {
		int l, r;
		Arrays.sort(A);
		l = 0;
		r = arr_size - 1;
		while (l < r) {
			if (A[l] + A[r] == sum)
				return true;
			else if (A[l] + A[r] < sum)
				l++;
			else // A[i] + A[j] > sum
				r--;
		}
		return false;
	}
}
