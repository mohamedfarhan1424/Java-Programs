import java.util.*;
public class WordReversing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String names[]=s.nextLine().split(" ");
		String res="";
		for(int i=names.length-1;i>=0;i--) {
			res+=names[i]+" ";
		}
		System.out.println(res);
	}

}
