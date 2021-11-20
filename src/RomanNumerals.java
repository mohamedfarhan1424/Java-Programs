import java.util.HashMap;
import java.util.Scanner;

public class RomanNumerals {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String r=s.nextLine();
//		HashMap<Character, Integer> al=new HashMap<Character, Integer>();
//		al.put('I', 1);
//		al.put('V', 5);
//		al.put('X', 10);
//		al.put('L', 50);
//		al.put('C', 100);
//		al.put('D', 500);
//		char last=r.charAt(0);
//		int res=0;
//		for(char c:r.toCharArray()) {
//			if(al.get(last)<al.get(c)) {
//				res-=al.get(last)*2;
//			}
//			res+=al.get(c);
//			last=c;
//		}
//		System.out.println(res);
		char romans[]= {'I','V','X','L','C','D'};
		int numerals[]= {1,5,10,50,100,500};
		int res=0;
		char last=r.charAt(0);
		for(char c:r.toCharArray()) {
			if(numerals[findIndex(last,romans)]<numerals[findIndex(c,romans)]) {
				res-=numerals[findIndex(last, romans)]*2;
			}
			res+=numerals[findIndex(c,romans)];
			last=c;
		}
		System.out.println(res);
	}
	private static int findIndex(char c,char[] romans) {
		for(int i=0;i<romans.length;i++) {
			if(romans[i]==c) {
				return i;
			}
		}
		return -1;
	}
}
