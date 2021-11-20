import java.util.*;
public class CoolNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int k=s.nextInt();
		int count=0;
		for(int i=5;i<=r;i++) {
			int c=0;
			String temp=Integer.toBinaryString(i);
			for(int j=0;j<=temp.length()-3;j++) {
				if(temp.substring(j,j+3).equals("101")) {
					c++;
				}
			}
			if(c>=k) {
				count++;
			}
		}
		System.out.println(count);
	}
}
