
public class Sumfree {
	public static void main(String args[]) {
		int a[]= {2,3};
		int sum=0;
		boolean sumfree=true;
		for(int i=0;i<2;i++){
			sum=0;
			for(int j=0;j<2;j++){
				if(i==j){continue;}
				sum=sum+a[j];
				System.out.println(sum);
				if(a[i]==a[j]*2+sum){
					sumfree=false;
					System.out.println(sumfree);
					break;
				}
			}
		}
		System.out.println(sumfree);
	}
}
