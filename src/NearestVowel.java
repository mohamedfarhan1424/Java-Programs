import java.util.Scanner;

public class NearestVowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String c=s.nextLine();
		String res="";
		for(char a:c.toCharArray()) {
			res+=getNearestVowel(a);
		}
		System.out.println(res);

	}
	private static char getNearestVowel(char a) {
		char vowels[]= {'a','e','i','o','e'};
		char res=vowels[0];
		int min=Math.abs(a-'a');
		for(char c:vowels) {
			int temp=Math.abs(a-c);
			if(min>temp) {
				min=temp;
				res=c;
			}
		}
		return res;
	}

}
