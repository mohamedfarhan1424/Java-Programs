import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String names[]=new String[n];
		for(int i=0;i<n;i++) {
			names[i]=s.next();
		}
		String angrm=s.next();
		int count=0;
		for(String i:names) {
			if(isAnagram(i,angrm)) {
				count++;
			}
		}
		System.out.println(count);

	}
	private static boolean isAnagram(String s1,String s2) {
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(String.valueOf(c1).equals(String.valueOf(c2))) {
			return true;
		}
		return false;
	}

}
