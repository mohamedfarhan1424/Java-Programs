import java.util.Scanner;

public class unique {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int x=0;x<t;x++) {
			int n=s.nextInt();
			String str=s.next();
			int d=0;
			String temp=str;
			int i=0;
			for(char c:str.toCharArray()) {
				if(temp.charAt(i)=='#') { i++;continue;}
				char al=(char)(c>='A'&&c<='Z'?c+32:c-32);
				if(!temp.contains(al+"")) {
					d+=n;
				}
				else {
					temp=temp.replaceFirst(c+"", "#");
					temp=temp.replaceFirst(al+"", "#");
				}
				i++;
			}
			System.out.println(d);
		}
		
		
	}

}
