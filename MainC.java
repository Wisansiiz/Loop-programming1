import java.util.*;
class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n;
		double sum=0,average;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		while(i<=n&&reader.hasNext()){
			int s=reader.nextInt();
			sum=sum+s;
			i++;
		}
		average=sum/n;
		System.out.printf("%.0f ",sum);
		System.out.printf("%.5f",average);
        reader.close();
	}

}
