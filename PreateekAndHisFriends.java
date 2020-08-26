
import java.util.Scanner;

public class PrateekAndHisFriends {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			long[] money = new long[n];
			for (int i = 0; i < n; i++) {
				money[i] = sc.nextInt();
			}
			long sum;
			int c = 0;
			sum = money[0];
			for (int i = 1; i < n; i++) {
				if (sum < x)
					sum = sum + money[i];
				else if (sum == x)
					break;
				while (sum > x) {
					sum = sum - money[c];
					c++;
				}
			}
			if (sum == x)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}

}
