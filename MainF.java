import java.util.*;
class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,sum=0;
		String all="";
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		while(i<=n){
			sum=sum+i;
			if(i<n)all=all+""+i+"+";
			else all=all+n+"="+sum;
			i++;
		}
		System.out.println(all);
        cin.close();
	}

}
