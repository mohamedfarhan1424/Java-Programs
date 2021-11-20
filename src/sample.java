import java.util.Arrays;
import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.next();
		}
		String angram=s.next();
		int count=0;
		for(String i:arr) {
			if(isAnagram(i,angram)) {
				count++;
			}
		}
		System.out.println(count);

	}
	public static boolean isAnagram(String i,String angram) {
		char c1[]=i.toCharArray();
		char c2[]=angram.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			return true;
		}
		return false;
	}

}
