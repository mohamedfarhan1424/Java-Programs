import java.util.Scanner;

public class sample4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int destination=s.nextInt();
		if(destination%5>0) {
			System.out.println((int)destination/5+1);
		}
		else {
			System.out.println((int)destination/5);
		}

	}

}
