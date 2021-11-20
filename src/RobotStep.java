import java.util.*;
public class RobotStep {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int des=s.nextInt();
		System.out.println(des%5>0?des/5+1:des/5);
	}
}
