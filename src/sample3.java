import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			b[i]=arr[i];
		}
		Arrays.sort(b);
		HashSet<Integer> al=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			al.add(arr[i]);
		}
		int flag=0;
		for(int i=0;i<n;i++) {
			if(b[i]!=i+1) {
				flag=1;
				break;
			}
		}
		if(al.size()==arr.length&&flag==0&&!Arrays.equals(arr, b)) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
	}

}
