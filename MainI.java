import java.util.*;
class MainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g,h,i,j;
		int x=1,n;
		Scanner cin = new Scanner (System.in);
		n=cin.nextInt();
		while(x<=n&&cin.hasNext()){
			a=cin.nextInt();
			b=cin.nextInt();
			c=cin.nextInt();
			d=cin.nextInt();
			e=cin.nextInt();
			f=cin.nextInt();
			g=cin.nextInt();
			h=cin.nextInt();
			i=cin.nextInt();
			j=cin.nextInt();
			int min;
			min=Math.min(Math.min(Math.min(Math.min(a, b), 
			        Math.min(c,d)),Math.min(e, f)),
			        Math.min(Math.min(g, h),Math.min(i, j)));
			System.out.println(min);
			x++;
		}
		cin.close();
	}

}
