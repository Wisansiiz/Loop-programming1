import java.util.*;
class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext())
        {
        	a=cin.nextInt();
        	String s=""+a;
        	int l=s.length(),i=s.length();
        	int sum=0;
        	while(l>0){
        	if(a/10!=0||a%10!=0){
        		sum=a%10+sum;
        		a=a/10;
        	}
        	l--;
        }System.out.println(i+" "+sum);
        }
        cin.close();
	}

}
