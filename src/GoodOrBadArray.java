import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class GoodOrBadArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(b);
		HashSet<Integer> al=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			al.add(a[i]);
		}
		int f=0;
		for(int i=0;i<n;i++) {
			if(b[i]!=i+1) {
				f=1;
				break;
			}
		}
		if(f==0&&!Arrays.equals(a, b)&&a.length==al.size()) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}

	}

}
