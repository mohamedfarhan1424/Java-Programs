import java.util.Scanner;

public class maxsubsegment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int max = 0;
		int c = 1;
		for (int i = 0; i < n-1; i++) {
			if (a[i] < a[i + 1]) {
				c++;
			}
			else {
				c=1;
			}
			if(max<c) {
				max=c;
			}
		}
		System.out.println(max);
		
	}

}
