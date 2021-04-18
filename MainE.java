import java.util.*;
class MainE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,sum=0;
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		while(i<=n){
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
        cin.close();
	}

}
