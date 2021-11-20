import java.util.HashSet;
import java.util.Scanner;

public class good {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0) {
			String str=s.next();
			HashSet<Character> al=new HashSet<Character>();
			for(char c:str.toCharArray()) {
				al.add(c);
			}
			String res="";
			for(char c:al) {
				res+=c+"";
			}
			System.out.println(res);
			t--;
		}
	}	
}
