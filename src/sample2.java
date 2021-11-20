import java.util.HashMap;
import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		HashMap<Character, Integer> numerals=new HashMap<Character,Integer>();
//		numerals.put('I',1);
//		numerals.put('V',5);
//		numerals.put('X',10);
//		numerals.put('L',50);
//		numerals.put('C',100);
//		numerals.put('D',500);
//		int result=0;
//		char lastroman=roman.charAt(0);
//		for(char c:roman.toCharArray()) {
//			if(numerals.get(lastroman)<numerals.get(c)) {
//				result-=numerals.get(lastroman)*2;
//			}
//			result+=numerals.get(c);
//			lastroman=c;
//		}
//		System.out.println(result);
		char romans[]= {'I','V','X','L','C','D'};
		int numerals[]= {1,5,10,50,100,500};
		int result=0;
		char lastroman=str.charAt(0);
		for(char c:str.toCharArray()) {
			int last=numerals[findIndex(lastroman,romans)];
			int num=numerals[findIndex(c,romans)];
			if(last<num) {
				result-=last*2;
			}
			result+=num;
			lastroman=c;
		}
		System.out.println(result);

	}
	public static int findIndex(char c,char[] romans) {
		for(int i=0;i<romans.length;i++) {
			if(romans[i]==c) {
				return i;
			}
		}
		return -1;
	}

}
